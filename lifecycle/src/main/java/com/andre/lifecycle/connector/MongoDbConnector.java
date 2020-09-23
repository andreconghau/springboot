package com.andre.lifecycle.connector;

public class MongoDbConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("MongoDb Connected");
    }
}
