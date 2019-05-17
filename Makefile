build:
	./gradlew clean
	./gradlew build

run:
	java -jar build/libs/remote-screenshot-0.0.1-SNAPSHOT.jar


.PHONY: build
