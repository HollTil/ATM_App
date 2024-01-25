package de.srh.holtil.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLConnection {
    private String host = "127.0.0.1";
    private String username = "root";
    private String password = "";
    private int port = 3306;
    private String dbname = "java_csv2sql";
    private Connection connection = null;

    public SQLConnection(Properties dbProperties) {
        if (dbProperties != null) {
            System.out.println("INFO: reading database config...");

            host = dbProperties.getProperty("db.host");
            username = dbProperties.getProperty("db.username");
            password = dbProperties.getProperty("db.password");
            port = Integer.valueOf(dbProperties.getProperty("db.port"));
            dbname = dbProperties.getProperty("db.dbname");
        }
    }


    public Connection getConnection() {
        if (this.connection == null) {

            String url = "jdbc:mysql://" + host + ":" + port + "/" + dbname;
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("ERROR: cannot connect to the database. " + ex.getMessage());
            }
        }

        return connection;
    }
}
