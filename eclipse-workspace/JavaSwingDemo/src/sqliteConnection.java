import java.sql.*;


import javax.swing.*;

public class sqliteConnection {
	
	Connection conn = null;

	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ivan Duane\\Desktop"
					+ "\\DB Browser for SQLite\\EmployeeData.db");
		
			return conn;
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}
