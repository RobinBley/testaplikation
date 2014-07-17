/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testaplikation.daten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

/**
 *
 * @author rbley
 */
public class Datenbank implements DatenInterface {

    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    //private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    //private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:derby://localhost:1527/sample";
    private final static transient Logger log = Logger.getLogger(Datenbank.class);
    private static Statement stmt = null;

    @Override
    public String load() {

        try {
            Class.forName(JDBC_DRIVER).newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {

            log.fatal("Driver failed", e);

        }
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(DB_URL, "app", "app");

        } catch (SQLException e) {
            log.fatal("connection failed", e);
        }

        if (connection != null) {
            try {

                stmt = connection.createStatement();
                ResultSet result = stmt.executeQuery("select DESCRIPTION from APP.PRODUCT where PRODUCT_ID = 988765");

                if (result.next()) {
                    return result.getString(1);
                } else {
                    log.debug("no result");
                }

                connection.close();
                stmt.close();
            } catch (SQLException ex) {
                log.fatal("kein Zugriff auf den Datensatz", ex);
            }

        } else {
            log.fatal("connection failed");

        }

        return "Hallo Welt";
    }

}
