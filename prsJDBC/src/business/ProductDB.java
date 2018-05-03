package business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBUtil;

public class ProductDB {
	//in DB, we are going to do 4 things: List P689, Get P689, Add P691, and Remove P
		public static List<Product> list() {
			
			List<Product> products= new ArrayList <> ();
			
			//list is same as getAll - copy from chap 21.2 ProductDB ex that starts line String sql = "SELECT 
			 String sql = "SELECT * FROM product";
	    //  List<Product> products = new ArrayList<>();
	      try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql);
	           ResultSet rs = ps.executeQuery()) {
	      	
	      	while (rs.next()) {
//	              String code = rs.getString(1);
//	              String description = rs.getString(2);
//	              double price = rs.getDouble(3);
	//
//	              Product p = new Product(code, description, price);
	      		Product p = getVendorFromRow (rs);
	              products.add(p);
	          }
	         
	      } 
	          catch (SQLException e) {
	          System.err.println(e);
	          return null;
	      }
	      return products;
		}
		
//		public static Vendor get(int id) { //similar to get (String Code) p689 and also in ProductDB
//			Vendor v = new Vendor();
//			String sql = "SELECT * FROM vendor WHERE id = ?";
//			try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql)) {
//				ps.setInt(1, id);
//				ResultSet rs = ps.executeQuery();
////				rs.next();
////				v = getVendorFromRow(rs);
//				while (rs.next()) {
//					v = getVendorFromRow(rs);
//				}
//			} catch (SQLException e) {
//				System.err.println(e);
//				return null;
//			}
//
//			return v;
//		}
//		
//		public static boolean add(Product p) {
//			String sql = "INSERT INTO Vendor (Code, Name, Address, City, State, Zip, Phone, Email, IsPreApproved) "
//					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//			try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql)) {
//				ps.setString(1, v.getCode());
//				ps.setString(2, v.getName());
//				ps.setString(3, v.getAddress());
//				ps.setString(4, v.getCity());
//				ps.setString(5, v.getState());
//				ps.setString(6, v.getZip());
//				ps.setString(7, v.getPhone());
//				ps.setString(8, v.getEmail());
//				ps.setBoolean(9, v.isPreapproved());
//				ps.executeUpdate();
//				return true;
//			} catch (SQLException e) {
//				System.err.println(e);
//				return false;
//			}
//		}
//		
////		public static boolean remove(Product p) {
//			String sql = "DELETE from Vendor where id = ? ";
//			try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql)) {
//				ps.setInt(1, v.getId());
//				ps.executeUpdate();
//				return true;
//			} catch (SQLException e) {
//				System.err.println(e);
//				return false;
//			}
//		}

	    private static Product getVendorFromRow(ResultSet rs) throws SQLException {
	    	int id = rs.getInt(1);
	    	int vendorId = rs.getInt(2);
	    	String vendorPartNumber= rs.getString(3);
	    	String name = rs.getString(4);
	    	double price = rs.getDouble(5);
	    	String unit= rs.getString(6);
	    	String photoPath= rs.getString(7);
	    	

	       Product p = new Product( id, vendorId, vendorPartNumber, name, price, unit, photoPath);        
	        return p;
	    }
}
