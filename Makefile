.SHELLFLAGS += -x -e
PWD = $(shell pwd)
UID = $(shell id -u)
GID = $(shell id -g)
VERSION = $(shell cd version/ && go run -v .)

all: clean fetch diff build

clean:
	rm -rf docs/
	rm -rf src/

build:
	docker run \
		--rm -v ${PWD}:/local \
		--user ${UID}:${GID} \
		docker.io/openapitools/openapi-generator-cli:v6.2.0 generate \
		--additional-properties=npmVersion=${NPM_VERSION} \
		-i /local/schema.yml \
		-g kotlin \
		-o /local \
		-c /local/config.yaml
	rm -rf ./test
	rm -f .travis.yml git_push.sh

diff:
	docker run \
		--rm -v ${PWD}:/local \
		--user ${UID}:${GID} \
		docker.io/openapitools/openapi-diff:2.1.0-beta.6 \
		--markdown /local/diff.test \
		/local/schema-old.yml /local/schema.yml
	rm -f schema-old.yml

fetch:
	mv schema.yml schema-old.yml
	wget -O schema.yml https://raw.githubusercontent.com/goauthentik/authentik/master/schema.yml
