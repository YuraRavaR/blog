# BlogApplication

BlogApplication is a simple web application built with Spring Boot for managing a blog. It allows users to create, view, edit and delete blog posts.


## Getting Started

### Running with Docker Compose

Follow these steps:

### 1. Navigate to the Docker Directory

Change to the directory containing the `docker-compose.yml` file:

```bash
cd docker
```
### 2. Start the Application

Run the application using Docker Compose:

```bash
docker-compose up
```
### 3. Access the Application

Open a web browser and navigate to:

[http://localhost:8080/](http://localhost:8080/)

### 4. Stop the Docker Compose Setup

To stop and remove the Docker containers, run:

```bash
docker-compose down
```


### Additional Information

- **Swagger**: Access the Swagger documentation at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) for API documentation and testing.

- **Database**: The application uses PostgreSQL


#
#
#
#
#
#
## How to Run



1. Navigate to `BlogApplication` class and run 
2. http://localhost:8080/



## How to Run using docker

1. Generate JAR file using Maven package command:
  ```
mvn package -DskipTests
  ```
Jar file in `target` directory

2. Insert JAR file in Docker package
3. In terminal switch to docker directory `cd docker`
4. Cmd:
- Delete existing container:

  ```
  docker rm 2e1c49560392
  ```
- Delete existing image
  ```
  docker rmi sha256:98886af4064099bd1eb8acd3eae7a9a8b0c4acd1dbc6ee5a24bfeff8aa53a3f3
  ```

- Generate new Docker image:
  ```
  docker build .
  ```

- Run the Docker image:
  ```
  docker run sha256:98886af4064099bd1eb8acd3eae7a9a8b0c4acd1dbc6ee5a24bfeff8aa53a3f3
  ```
5. Or use Docker Compose
- generate image,
- navigate to docker-compose.yml update image:
  ```
  docker-compose up
  ```
6. docker-compose up
7. docker ps
8. docker-compose logs app

9. swagger http://localhost:8080/swagger-ui/index.html