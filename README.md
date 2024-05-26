## How to Run


1. Go to BlogApplication and run 
2. http://localhost:8080/



## How to Run using docker

1. Generate the JAR file using Maven package command with skipping tests:
  ```
mvn package -DskipTests
  ```
2. Replace the JAR file in the Docker package with the newly generated one. File located in the target directory
3. Go to terminal and switch to docker directory
4. Cmd:
- Delete the existing container:

  ```
  docker rm 2e1c49560392
  ```
- Delete the existing image
  ```
  docker rmi sha256:98886af4064099bd1eb8acd3eae7a9a8b0c4acd1dbc6ee5a24bfeff8aa53a3f3
  ```

- Generate a new Docker image:
  ```
  docker build .
  ```

- Run the Docker image:
  ```
  docker run sha256:98886af4064099bd1eb8acd3eae7a9a8b0c4acd1dbc6ee5a24bfeff8aa53a3f3
  ```
5. Or use Docker Compose to bring up the container
- generate image,
- navigate to docker-compose.yml update image:
  ```
  docker-compose up
  ```
6. docker-compose up
7. docker ps
8. docker-compose logs app