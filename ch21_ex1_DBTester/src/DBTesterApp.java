import java.sql.*;

public class DBTesterApp {

    private static Connection connection;

    public static void main(String args[]) {        
        // open connection //as on p677
        try { //open connection and close it below
            String dbUrl = "jdbc:sqlite:products.sqlite";
            connection = DriverManager.getConnection(dbUrl);        
        } catch (SQLException e) {
            System.err.println(e);
            return;
        }        
        
        // select data from database
        printProducts();
        printFirstProduct();
        printProductByCode("jsp");

        // modify data in the database
        Product p = new Product("test1", "Test Product", 49.50);
        insertProduct(p);
        printProducts();
        deleteProduct(p);
        printProducts();

        // close connection
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);            
        }
    }

    public static void printProducts() {
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM Products")) {
            Product p;

            System.out.println("Product list:");
            while (rs.next()) {
                String code = rs.getString("ProductCode");
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");

                p = new Product(code, description, price);

                printProduct(p);
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    	//question 5
    public static void printFirstProduct() {
        // add code that prints the record for the first product in the Products table
        // you can not print a method until you Connect (to the database), Query and Execute P687-691
        //bc this is a static method, you don't need P687, get method directly - to try to Connect P679/689
    	// Product p = new Product(); declare this with specifics down in try statement
        try (Statement statement = connection.createStatement()) {
        		ResultSet rs=statement.executeQuery("SELECT * FROM Products");
        		if (rs.next()) {	
        			
        			// code that uses column names
                    String code = rs.getString("ProductCode");
                    String description = rs.getString("Description");
                    double price = rs.getDouble("Price");
                    Product p = new Product(code, description, price);
             
        	        System.out.println("First product:");
        	        printProduct(p);
        	        System.out.println();
        	        // rs.close();
        			}  //this will only print the first product bc it is not the while loop, it stops at rs.next only
        		}
        	catch (SQLException e) {
        		System.err.println(e);
        		}
        	}
    // question 7
    public static void printProductByCode(String productCode) {
        //Product p = new Product();
        // add code that prints the product with the specified code
        // use if statement to print any (one) product with specific code P685-689
    	String sql = "SELECT * FROM products WHERE ProductCode = ?";
        try (PreparedStatement ps=connection.prepareStatement(sql)) {
        	ps.setString(1, productCode); //remember this line to set one specific code from P685
    		ResultSet rs=ps.executeQuery();
    		if (rs.next()) {
    		
    			// code that query one specific code
                String code = rs.getString(1);
                String description = rs.getString(2);
                double price = rs.getDouble(3);
                Product p = new Product(code, description, price);
                //print one specific product code
                System.out.println("Product by code: " + productCode);
                printProduct(p);
                System.out.println();
    		}     
     			} 
     catch (SQLException e) {
		System.err.println(e);
		}
	}
    // question 9 Page 691
    public static void insertProduct(Product p) {
        System.out.println("Insert test: ");
        // add code that inserts the specified product into the database
        // if a product with the specified code already exists, display an error message - if i run "test" twice, above in main methode
        String sql = "INSERT INTO Products (ProductCode, Description, Price) VALUES (?, ?, ?)";
        try (PreparedStatement ps=connection.prepareStatement(sql)) {
        	ps.setString(1, p.getCode()); //we are telling class p at method signature level to get method P685
        	ps.setString(2, p.getDescription());
        	ps.setDouble(3, p.getPrice());
        	//int rc=ps.executeUpdate(); //rc: rawCount (not used)
        	//no "if statemen" bc it is a boolean, in stead print product p
        	ps.executeUpdate();
        	printProduct(p);
        	System.out.println();
    		}
        catch (SQLException e) {
    		System.err.println(e);
    		}
        }
    //question 11
    private static void deleteProduct(Product p) {
        System.out.println("Delete test: ");
        // add code that deletes the specified product from the database
        // if a product with the specified code doesn't exist, display an error message
        String sql = "DELETE FROM products WHERE ProductCode = ?";
        try (PreparedStatement ps=connection.prepareStatement(sql)) {  	
        	
        	ps.setString(1, p.getCode()); //P685 You only delete the Primary key to delete entire recode, not the description
//        	ps.setString(2, p.getDescription()); 
//        	ps.setDouble(3, p.getPrice());	
        	ps.executeUpdate();
        	
        	printProduct(p);
        	System.out.println();
        }
        catch (SQLException e) {
    		System.err.println(e);
    		}
    }

    // use this method to print a Product object on a single line
    private static void printProduct(Product p) {
        String productString
                = StringUtil.padWithSpaces(p.getCode(), 12)
                + StringUtil.padWithSpaces(p.getDescription(), 38)
                + p.getFormattedPrice();

        System.out.println(productString);
    }
}