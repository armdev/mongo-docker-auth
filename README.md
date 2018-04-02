# docker-mongo-service
docker service for mongodb

clone of https://github.com/armdev/docker-mongo-service , but with auth enabled mongodb

1. ./run.sh

2. enter to the mongo container

docker  exec -it mongo bash

3. run mongo
mongo

4. actions

use admin;


db.createUser(
  {
    user: "devadmin",
    pwd: "devadmin",
    roles: [ { role: "root", db: "admin" } ]
  }
)


5. Logout

6. mongo -u devadmin -p devadmin --authenticationDatabase "admin"

7. use guruDB;

8.

 db.createUser(  
  {
    user: "testuser",
    pwd: "testpass",
    roles: [ { role: "readWrite", db: "guruDB" } ]
  }
)

9.  logout
10. docker restart mongo

11. Access url

http://192.168.1.241:5008/api/v2/person/save
