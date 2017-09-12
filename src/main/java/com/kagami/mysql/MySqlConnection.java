package com.kagami.mysql;

import com.kagami.DBConnection;

import java.sql.Connection;

public class MySqlConnection extends DBConnection {

    private static String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
    private static String url = "jdbc:odbc:JavaMsAccess";

    public Connection getAccessConnection() {
        return super.getConnection(driverName, url);
    }

}
