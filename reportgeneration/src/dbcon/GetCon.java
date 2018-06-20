package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetCon {
	
	public static Connection getConnection() {
		Connection con=null;
		 String url = "jdbc:mysql://localhost:3306/samba";
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(url,"root","root");
	        }catch(ClassNotFoundException e){
	            e.printStackTrace();
	            System.out.println("mysql connector jar missing");
	        }catch(SQLException e){
	            e.printStackTrace();
	            System.out.println("DB connection Exception");
	        }
		return con;
	}
}
