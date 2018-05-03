package business;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import db.DBUtil;

public class UserDB {
	
	public UserDB() {
	}
		
	public User authenticateUser(String uName, String pwd) {
		User usr = null;
		String sql = "Select * FROM User where UserName = ? and password = ?";
		try(Connection connection = DBUtil.getConnection();
	       		PreparedStatement ps = connection.prepareStatement(sql))
		{
			ps.setString(1, uName);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				usr = getUserFromResultSet(rs);
			}
			DBUtil.closeConnection(); // close open connection
		}
		catch (SQLException sqle) {
			System.out.println("Error logging in user for username '"+uName+"' and pwd = '"+pwd+"'!");
			sqle.printStackTrace();
		}
		
		return usr;
	}

	public ArrayList<User> list() {
		ArrayList<User> users = new ArrayList<>();
		String sql = "Select * FROM User";
		try
		{
			ResultSet rs = getResultSetFromQuery(sql);
			while (rs.next()) {
				User usr = getUserFromResultSet(rs);
				users.add(usr);
			}
			DBUtil.closeConnection();
		}
		catch (SQLException sqle) {
			System.out.println("Error retrieving all users.");
			sqle.printStackTrace();
		}
		
		return users;
	}

	public User getUserByUserName(String inUserName) {
		User usr = null;
		String sql = "Select * FROM User where UserName = '"+inUserName+"'";
		try
		{
			ResultSet rs = getResultSetFromQuery(sql);
			while (rs.next()) {
				usr = getUserFromResultSet(rs);
			}
			DBUtil.closeConnection();
		}
		catch (SQLException sqle) {
			System.out.println("Error retrieving user for username '"+inUserName+"'!");
			sqle.printStackTrace();
		}
		
		return usr;
	}
	public boolean add(User u) { //p691 add a product
		String sql = "insert into user (UserName,Password,FirstName,LastName,Phone,Email,IsReviewer,IsAdmin)" +
				 "values (?, ?, ?, ?, ?, ?, ?, ?)";
		int rowsUpdated = 0;
		boolean success = false;
		
		try (Connection connection = DBUtil.getConnection();
       		PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) { // need the oid back after insert
           ps.setString(1, u.getUserName());
           ps.setString(2, u.getPassword());
           ps.setString(3, u.getFirstName());
           ps.setString(4, u.getLastName());
           ps.setString(5, u.getPhoneNumber());
           ps.setString(6, u.getEmail());
           ps.setBoolean(7, u.isReviewer());
           ps.setBoolean(8, u.isAdmin());
           rowsUpdated = ps.executeUpdate();
           //upon successful insert, get the generated key from prepared statement
           try (ResultSet generatedKey = ps.getGeneratedKeys()) {
        	   if (generatedKey.next()) {
        		   u.setId(generatedKey.getInt(1));
        	   }
           }
		}
		catch (SQLException sqle) {
			System.out.println("Error adding user!");
			sqle.printStackTrace();
		}
       if (rowsUpdated>0) success=true;
       return success;
	}

	// Not to be used in capstone... only for demonstration of inserting with a timestamp
	public boolean addUserTimestamp(User u) {
		String sql = "INSERT INTO user (UserName, Password, FirstName, LastName, Phone, Email, IsReviewer, IsAdmin, DateCreated) "+
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		int rowsUpdated = 0;
		boolean success = false;
		
		try (Connection connection = DBUtil.getConnection();
       		PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) { // need the oid back after insert
           ps.setString(1, u.getUserName());
           ps.setString(2, u.getPassword());
           ps.setString(3, u.getFirstName());
           ps.setString(4, u.getLastName());
           ps.setString(5, u.getPhoneNumber());
           ps.setString(6, u.getEmail());
           ps.setBoolean(7, u.isReviewer());
           ps.setBoolean(8, u.isAdmin());
           //ps.setString(9, u.getDateCreated().toString());
           rowsUpdated = ps.executeUpdate();
           //upon successful insert, get the generated key from prepared statement
           try (ResultSet generatedKey = ps.getGeneratedKeys()) {
        	   if (generatedKey.next()) {
        		   u.setId(generatedKey.getInt(1));
        	   }
           }
		}
		catch (SQLException sqle) {
			System.out.println("Error adding user!");
			sqle.printStackTrace();
		}
       if (rowsUpdated>0) success=true;
       return success;
	}

	private User getUserFromResultSet(ResultSet rs) throws SQLException{
		User u = new User();
		u.setId(rs.getInt(1));
		u.setUserName(rs.getString(2));
		u.setPassword(rs.getString(3));
		u.setFirstName(rs.getString(4));
		u.setLastName(rs.getString(5));
		u.setPhoneNumber(rs.getString(6));
		u.setEmail(rs.getString(7));
		u.setReviewer(rs.getBoolean(8));
		u.setAdmin(rs.getBoolean(9));
		
		
		String dateTimeString = rs.getString(11);
		StringBuilder dateTimeStringT = new StringBuilder(dateTimeString);
		dateTimeStringT.setCharAt(10, 'T');
		System.out.println(dateTimeStringT);
		LocalDateTime createDateT = LocalDateTime.parse(dateTimeStringT);
		// u.setDateCreated(createDateT);
		// if we wanted only LocalDate
//		String dateString = dateTimeString.substring(0,10);
//		LocalDate createDate = LocalDate.parse(dateString);
//		u.setDateCreated(createDate);
		
		
		return u;
	}
	
	private ResultSet getResultSetFromQuery(String sqlStmt) throws SQLException{
		
		Connection connection = DBUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sqlStmt);
		ResultSet rs = ps.executeQuery();
		return rs;

	}
	public boolean remove(User u) {
		String sql = "delete from user where id = ?";
		int rowsUpdated = 0;
		boolean success = false;
		
		try (Connection connection = DBUtil.getConnection();
       		PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) { // need the oid back after insert
           ps.setInt(1, u.getId());
           rowsUpdated = ps.executeUpdate();
		}
		catch (SQLException sqle) {
			System.out.println("Error adding user!");
			sqle.printStackTrace();
		}
       if (rowsUpdated>0) success=true;
       return success;
	}

}
