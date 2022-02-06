import java.sql.*;

public class connectionz {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:ucanaccess://C:\\Users\\Ivan Duane\\Documents\\Database13.accdb";
		Connection con = DriverManager.getConnection(url);
		Statement s = con.createStatement();
		con = DriverManager.getConnection(url, null, null);

	}

}
