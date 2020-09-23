package com.andre.lifecycle.connector;

public class MySqlConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Mysql Connected");
    }
}
