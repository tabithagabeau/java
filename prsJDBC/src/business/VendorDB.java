package business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBUtil;


public class VendorDB {

	//in DB, we are going to do 4 things: List P689, Get P689, Add P691, and Remove P
	public static List<Vendor> list() {
		
		List<Vendor> vendors = new ArrayList <> ();
		
		//list is same as getAll - copy from chap 21.2 ProductDB ex that starts line String sql = "SELECT 
		 String sql = "SELECT * FROM vendor";
    //  List<Product> products = new ArrayList<>();
      try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql);
           ResultSet rs = ps.executeQuery()) {
      	
      	while (rs.next()) {
//              String code = rs.getString(1);
//              String description = rs.getString(2);
//              double price = rs.getDouble(3);
//
//              Product p = new Product(code, description, price);
      		Vendor v = getVendorFromRow (rs);
              vendors.add(v);
          }
         
      } 
          catch (SQLException e) {
          System.err.println(e);
          return null;
      }
      return vendors;
	}
	
	public static Vendor get(int id) { //similar to get (String Code) p689 and also in ProductDB
		Vendor v = new Vendor();
		String sql = "SELECT * FROM vendor WHERE id = ?";
		try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
//			rs.next();
//			v = getVendorFromRow(rs);
			while (rs.next()) {
				v = getVendorFromRow(rs);
			}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}

		return v;
	}
	
	public static boolean add(Vendor v) {
		String sql = "INSERT INTO Vendor (Code, Name, Address, City, State, Zip, Phone, Email, IsPreApproved) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql)) {
			ps.setString(1, v.getCode());
			ps.setString(2, v.getName());
			ps.setString(3, v.getAddress());
			ps.setString(4, v.getCity());
			ps.setString(5, v.getState());
			ps.setString(6, v.getZip());
			ps.setString(7, v.getPhone());
			ps.setString(8, v.getEmail());
			ps.setBoolean(9, v.isPreapproved());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}
	
	public static boolean remove(Vendor v) {
		String sql = "DELETE from Vendor where id = ? ";
		try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql)) {
			ps.setInt(1, v.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

    private static Vendor getVendorFromRow(ResultSet rs) throws SQLException {
    	int id = rs.getInt(1);
    	String code = rs.getString(2);
    	String name = rs.getString(3);
    	String address = rs.getString(4);
    	String city = rs.getString(5);
    	String state = rs.getString(6);
    	String zip = rs.getString(7);
    	String phone = rs.getString(8);
    	String email = rs.getString(9); 
    	boolean preApproved = rs.getBoolean(10);

        Vendor v = new Vendor(code, name, address, city, state, zip, phone, email, preApproved);        
        return v;
    }

}




