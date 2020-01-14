Here you can find full example for docker mongo spring boot
to try this first run 
$mvn clean install 
which goning  to make jar file in the target folder 
then you build docker image in the java directory 
$docker image build -f Dockerfile -t api-cell

go the swarm directory and run this
$ docker stack deploy -c docker-compose.yml db

wait and check with :
$docker service ls 
$docker ps

and you can lose this mongo-express if you like and use mongoDB Compass connect to:
**server: localhost 
**port: 9090

command lines to remember:

**for windows to add CSV **
	mongoimport --db Cells --collection Cells2G --type csv --headerline --file C:\Users\mohd.ahmad\Documents\Codes\udemy-docker-mastery\test_mongocopycsv\datacells.csv

**inside container to add CSV *** make sure the collectionname starts with a letter **
mongoimport -d Cells -c cells2G --type csv --headerline  /home/cells.csv

**docker run --name db -d mongo:tag

**docker run --name db -d -v C:\Users\mohd.ahmad\Documents\Codes\udemy-docker-mastery\test_2\data\:/home mongo

**docker run --network db_default -e ME_CONFIG_MONGODB_SERVER=mongo -p 8081:8081 mongo-express

********** very important ***
docker service create --network db_default  try-this-please
**********oo

*****to clear volumes ***
docker system prune --volumes

*****to deploy swarm ***
docker stack deploy -c docker-compose.yml db

**** docker file ****
FROM openjdk:8-jdk-alpine
ADD /target/accessing-data-mongodb-0.0.1-SNAPSHOT.jar demo.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","demo.jar"]

