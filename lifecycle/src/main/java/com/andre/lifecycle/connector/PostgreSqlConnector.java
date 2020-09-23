package com.andre.lifecycle.connector;

public class PostgreSqlConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Postgre Connected");
    }
}
