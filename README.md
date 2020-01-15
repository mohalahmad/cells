Here you can find full example for docker mongo spring boot
-to try this first run in java folder directory
**$mvn clean install**

-which goning  to make jar file in the target folder 
then you build docker image in the java directory 
**$docker image build -f Dockerfile -t api-cell .**
**dont forget the dot (.) at the end**

-go the swarm directory and run this
**$docker stack deploy -c docker-compose.yml db**

-wait and check with :
**$docker service ls**
**$docker ps**

-also you can lose this mongo-express if you like and use mongoDB Compass connect to:
**server: localhost**
**port: 9090**

-command lines to remember:

-for windows to add CSV:
**mongoimport --db Cells --collection Cells2G --type csv --headerline --file cells.csv**

-inside container to add CSV:
***make sure the collection name starts with a letter**
**$mongoimport -d Cells -c cells2G --type csv --headerline  /home/cells.csv**

-VERY IMPORTANAT:
**$docker service create --network db_default  try-this-please**

-to clear volumes:
**$docker system prune --volumes**

-to deploy swarm:
**$docker stack deploy -c docker-compose.yml db**


**docker run --name db -d mongo:tag**

**docker run --name db -d -v C:\Users\PC\Documents\Codes\data\:/home mongo (add the dirctory you need to share inside the container)**

**docker run --network db_default -e ME_CONFIG_MONGODB_SERVER=mongo -p 8081:8081 mongo-express**

-dockerfile
**FROM openjdk:8-jdk-alpine
ADD /target/cells-1.jar cell.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","cell.jar"]**
