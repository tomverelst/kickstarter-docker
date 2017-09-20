# Spring Boot

In this exercise,
you will Dockerize a Spring Boot application yourself!

## 1 Create a Dockerfile

Start by creating the Dockerfile.
The final image should contain a Java 8 runtime and the fat Spring Boot jar.

The command to start the application is:

```
java -jar <application.jar>
```

**Bonus points:** Try out [Multi-Stage builds](https://docs.docker.com/engine/userguide/eng-image/multistage-build/).
You can add a Maven build step to create the jar file.

## Step 2: Add Compose

After you succesfully Dockerized the application,
try setting up a `docker-compose.yml` file.

The following services must be declared:
* An `app` service. Expose port 8080 to a random port.
* A `mongodb` service. Mount a volume onto the data path.

**Bonus points**: define overlay networks and connect the services to these