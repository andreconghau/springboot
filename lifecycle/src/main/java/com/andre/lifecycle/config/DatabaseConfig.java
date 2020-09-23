package com.andre.lifecycle.config;

import com.andre.lifecycle.connector.DatabaseConnector;
import com.andre.lifecycle.connector.MongoDbConnector;
import com.andre.lifecycle.connector.MySqlConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean("mysqlConnector")
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector mySqlConnector = new MySqlConnector();
        mySqlConnector.setUrl("jdbc:mysql://host1:33060/");
        // Set username, password, format, v.v...
        return mySqlConnector;
    }

    @Bean("mongodbConnector")
    DatabaseConnector mongodbConfigure() {
        DatabaseConnector mongoDbConnector = new MongoDbConnector();
        mongoDbConnector.setUrl("mongodb://mongodb0.example.com:27017/");
        // Set username, password, format, v.v...
        return mongoDbConnector;
    }

}
