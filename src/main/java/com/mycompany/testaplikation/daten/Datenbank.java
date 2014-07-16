/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testaplikation.daten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *
 * @author rbley
 */
public class Datenbank implements DatenInterface {

    //private static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DB_URL = "jdbc:derby://localhost:1527/sample";
    private final static transient Logger log = Logger.getLogger(Datenbank.class);

    @Override
    public String load() {

        try {
            Class.forName(JDBC_DRIVER).newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException  e) {
            System.out.println("Driver failed");
            log.fatal("Driver failed", e);

        } 
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(DB_URL);

        } catch (SQLException e) {
            System.out.println("Connection failed");
            log.fatal("connection failed", e);
        }

        if (connection != null) {
            System.out.println("Verbunden");

        } else {
            System.out.println("Connection failed");
            log.fatal("connection failed");
        }

        return "Hallo Welt";
    }

}
