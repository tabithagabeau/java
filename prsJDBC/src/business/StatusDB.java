package business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBUtil;


public class StatusDB {
	//in DB, we are going to do 4 things: List P689, Get P689, Add P691, and Remove P
		public static List<Status> list() {
			
			List<Status> status = new ArrayList <> ();
		
			 String sql = "SELECT * FROM status";
	    //  List<Product> products = new ArrayList<>();
	      try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql);
	           ResultSet rs = ps.executeQuery()) {
	      	
	      	while (rs.next()) {

	      		Status s= getStatusFromRow (rs);
	              status.add(s);
	          }
	         
	      } 
	          catch (SQLException e) {
	          System.err.println(e);
	          return null;
	      }
	      return status;
		}
		
		public static Status get(int id) { //similar to get (String Code) p689 and also in ProductDB
			Status s = new Status();
			String sql = "SELECT * FROM status WHERE id = ?";
			try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql)) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
//				rs.next();
//				v = getVendorFromRow(rs);
				while (rs.next()) {
					s = getStatusFromRow(rs);
				}
			} catch (SQLException e) {
				System.err.println(e);
				return null;
			}

			return s;
		}
		

	    private static Status getStatusFromRow(ResultSet rs) {
			// TODO Auto-generated method stub
			return null;
		}

		private static Status getVendorFromRow(ResultSet rs) throws SQLException {
	    	int id = rs.getInt(1);
	    	String description = rs.getString(2);
	    	
	        Status s= new Status(id, description);        
	        return s;
	    }

}
