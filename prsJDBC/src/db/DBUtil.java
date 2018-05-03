package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection connection;

	public static Connection getConnection()  throws SQLException {
		try {
			// set the db url, username, and password
			String url = "jdbc:mysql://localhost:3306/prs";
			String username = "root";
			String password = "Train@MAX";

			// get and return connection
			// Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			connection = DriverManager.getConnection(url, username, password);
			//return connection; you return it after catch
		} catch (SQLException e) {
			System.out.println("Error establishing connection!");
			throw e;
		}  

		return connection;

	}
	//close connection
	public static void closeConnection()  { //throws SQLException
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Error closing connection!");
				//throw e;
			} finally {
				connection = null;                
			}
		}
	}


}
