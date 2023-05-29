package SourceCode;

import java.sql.*;

public class Connect {
    
    Connection c;       //Global object declaretion
    Statement s;
    
    public Connect() {
        
//        MySQL is an external entity so, exception is must to handel any kida unwanted behaviour
        try {
//            Class.forName(com.mysql.cj.jdbc.Driver);        //To register driver(now it's not needed)
            c = DriverManager.getConnection("jdbc:mysql:///oopdata", "root", "12345");
            s = c.createStatement();
        } catch(Exception e) {
            System.out.print(e);
        }
    }
}
