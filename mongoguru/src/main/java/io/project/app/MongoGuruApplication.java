package io.project.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableReactiveMongoRepositories("io.project.mongo.repositories")
@ComponentScan("io.project")
public class MongoGuruApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoGuruApplication.class, args);
	}
        
        
}

//login with admin 
// mongo -u devadmin -p devadmin --authenticationDatabase "admin"
//sudo docker  exec -it mongo bash

// create  admin user
//db.createUser(
//  {
//    user: "devadmin",
//    pwd: "devadmin",
//    roles: [ { role: "root", db: "admin" } ]
//  }
//)


// use guruDB;

//db.createUser(  
//  {
//    user: "testuser",
//    pwd: "testpass",
//    roles: [ { role: "readWrite", db: "guruDB" } ]
//  }
//)



//docker-compose exec mongoDb mongo -u devadmin -p devadmin --authenticationDatabase "admin"

// mongo -u devadmin -p devadmin --authenticationDatabase "admin"

// https://github.com/jcolemorrison/db-docker-composers

// https://start.jcolemorrison.com/docker-fresh-mysql-or-mongodb-instances-in-projects/

// https://docs.mongodb.com/manual/tutorial/enable-authentication/