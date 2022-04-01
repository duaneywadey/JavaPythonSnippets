import java.sql.*;

public class DBExample {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:ucanaccess://C:\\Users\\Ivan Duane\\Documents\\Database11.accdb";
		Connection con = DriverManager.getConnection(url);
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * from Employees");
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + "\t\t\t" + rs.getString(2) + "\t\t\t" 
					+ rs.getString(3) + "\t\t\t" + rs.getString(4) + "\t\t\t" + rs.getString(5)
					+ "\t\t\t" + rs.getString(6) + "\t\t\t" + rs.getString(7));
		}
			

	}

}

