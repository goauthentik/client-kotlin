.SHELLFLAGS += -x -e
PWD = $(shell pwd)
UID = $(shell id -u)
GID = $(shell id -g)
VERSION = $(shell cd version/ && go run -v .)

all: clean fetch diff generate

clean:
	rm -rf build/
	rm -rf docs/
	rm -rf src/

.PHONY: generate
generate:
	docker run \
		--rm -v ${PWD}:/local \
		--user ${UID}:${GID} \
		docker.io/openapitools/openapi-generator-cli:v7.1.0 generate \
		-i /local/schema.yml \
		-g kotlin \
		-o /local \
		-c /local/config.yaml
	rm -rf ./test
	rm -f .travis.yml git_push.sh
	chmod +x ./gradlew
	# cp ./templates/build.gradle build.gradle

build:
	docker run -it --rm -v ${PWD}:/data -w /data eclipse-temurin:20 ./gradlew build

diff:
	docker run \
		--rm -v ${PWD}:/local \
		--user ${UID}:${GID} \
		docker.io/openapitools/openapi-diff:2.1.0-beta.6 \
		--markdown /local/diff.log \
		/local/schema-old.yml /local/schema.yml
	rm -f schema-old.yml

fetch:
	mv schema.yml schema-old.yml
	wget -O schema.yml https://raw.githubusercontent.com/goauthentik/authentik/master/schema.yml
