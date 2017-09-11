package com.kagami.access;

import com.kagami.DBConnection;

import java.sql.*;

public class AccessConnection  extends DBConnection {

    private static String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
    private static String url = "jdbc:odbc:JavaMsAccess";
    public Connection getAccessConnection() {
        return super.getConnection(driverName,url);
    }

   /* public static void main(String[] args) throws Exception{
        String sql ="SELECT * from tblCustomer";
        try {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connection Established..");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("+------------- Detail Customer ----------------------+");
                System.out.println("Customer ID : "+ rs.getInt(1));
                System.out.println("Customer Name : "+ rs.getString(2));
                System.out.println("Customer Address : "+ rs.getString(3));
                System.out.println("Customer Phone : "+ rs.getString(4));
                System.out.println("+----------------------------------------------------+");
                System.out.println("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/
}
