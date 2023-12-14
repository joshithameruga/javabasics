package java_class_work;

import java.sql.*;

public class Jdbc {
    public static void main(String args[]) throws Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techshop","root","joshithameruga@15");
    	
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select * from customers ");
    	
    	while(rs.next()) {
    	int id = rs.getInt("customerid");
    	String name = rs.getString("firstname");
    	String email = rs.getString("email");
    	
    	System.out.println(id +" " + name + " "+ email);
    	}
    	st.close();
    	con.close();
    }
}
