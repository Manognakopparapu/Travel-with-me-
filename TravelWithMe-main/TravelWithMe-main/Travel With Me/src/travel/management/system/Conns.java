
package travel.management.system;

import java.sql.*;
public class Conns {
    Statement stmt;
    Connection c;
    public Conns(){  
        try{  
        Class.forName("com.mysql.cj.jdbc.Driver");  
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/travelwithme","root","root");  
          
        stmt=c.createStatement();
        }catch(Exception e){
            //
        }
    
}
}
