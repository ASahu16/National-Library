/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author SAHU
 */
public class dbconnection {

    public Statement stmt = null;
    public Connection con = null;
    public PreparedStatement pstmt = null;
    public ResultSet rst = null;

    public dbconnection() {
        try {
             Class.forName("org.sqlite.JDBC");
                con =DriverManager.getConnection("jdbc:sqlite:NationalLibrary.db");
            
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/national_library", "root", "root");

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
