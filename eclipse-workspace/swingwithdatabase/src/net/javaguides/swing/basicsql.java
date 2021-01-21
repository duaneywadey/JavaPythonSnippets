package net.javaguides.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class basicsql {
	static Connection connection = null;
	static String databaseName = "";
	static String url = "jdbc:mysql://127.0.0.1:3306/?user=root" + databaseName;
	static String username = "root";
	static String password = "@grunge_21kurt";

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();         
		connection = DriverManager.getConnection(url, username, password); 
		PreparedStatement ps = connection.prepareStatement("INSERT INTO `StudentDatabase`. `student` (`name`) VALUES ('Ivan Duaney');");
		
		int status = ps.executeUpdate();
		if (status !=0) {
			System.out.println("DATABASE WAS CONNECTED");
			System.out.println("RECORD WAS INSERTED");
		}
		
		
		
		
		
	}

}
