import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connectionzzzz {
	public static Connection con;
	public static String dbFile = "C:\\Users\\Ivan Duane\\Documents\\Database13.accdb";
	public static String dbUrl = "jdbc:ucanaccess: " + dbFile.trim() + ";memory=true";
	
	public static Connection getConnection() {
		try {
			String url = "jdbc:ucanaccess://C:\\Users\\Ivan Duane\\Documents\\Database11.accdb";
			Connection con = DriverManager.getConnection(url);
			Statement s = con.createStatement();
			con = DriverManager.getConnection(url, "", "");
		
			
		}
		
		catch(Exception ex) {
			System.out.println(""+ex);
			
		}
		
		return con;
	}

}
