## How to generate artifacts

Use command to generate both(*.war and *.jar) artifacts:
```
    ./gradlew build          
```
* Use ``` ./gradlew clean war ``` to generate *.war artifact
* Use ``` ./gradlew clean jar ``` to generate *.jar artifact

## How to generate Docker image from the application

* Generate the docker image with command: ``` ./gradlew clean buildDocker ```