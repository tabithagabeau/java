import java.util.*;
import java.io.*;
import java.nio.file.*;

public final class CustomerTextFile implements DAO<Customer> {

    private List<Customer> customers = null;
    private Path customersPath = null;
    private File customersFile = null;
	private final String FIELD_SEP = "\t"; //to delimit in -5

    public CustomerTextFile() {
        // initialize the class variables 3-page 467
    	customersPath = Paths.get("customers.txt");
    	customersFile = customersPath.toFile();
        customers =this.getAll(); //bc it is an arrayList, it gets all page 479 	
    	}
    	//-4 this is the method that get.all
    @Override 
    public List<Customer> getAll() {
        // if the customers file has already been read, don't read it again
        if (customers != null) {
            return customers;
        }
        //-4
        customers = new ArrayList<>();
        // load the array list with Customer objects created from
        // the data in the file
      if (Files.exists(customersPath)) {
    	  try ( BufferedReader in =new BufferedReader(new FileReader(customersFile)) ){
    		  //read customers from file into array list
    			 String line =in.readLine();
    					
    			while (line != null)	{
    			String [] fields = line.split(FIELD_SEP);
    			String firstName = fields [0];
    			String lastName = fields [1];
    			String email = fields [1];
			
    			Customer c = new Customer ( firstName, lastName, email);
    			customers.add(c);
    				line =in.readLine();
   				
    					} 			
    				} 
    	  
    	  catch (IOException e) {
    					System.out.println(e);
    					return null; //end of -4
    		}
      }
        return customers;
  
    }

    @Override
    public Customer get(String email) {
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean add(Customer c) {
        customers.add(c);
        return this.saveAll();
    }

    @Override
    public boolean delete(Customer c) {
        customers.remove(c);
        return this.saveAll();
    }

    @Override
    public boolean update(Customer newCustomer) {
        // get the old customer and remove it
        Customer oldCustomer = this.get(newCustomer.getEmail());
        int i = customers.indexOf(oldCustomer);
        customers.remove(i);

        // add the updated customer
        customers.add(i, newCustomer);

        return this.saveAll(); 
    }
 
    // -5 use print writer, buffer out bc you are saving to system
    private boolean saveAll() {
        // save the Customer objects in the array list to the file
    	try ( PrintWriter out =new PrintWriter(new BufferedWriter(new FileWriter("customersFile"))))
    	{ //write out to the file	
    	 for (Customer c: customers) {
    		 out.print(c.getFirstName()+ FIELD_SEP); //-5 added delimit field_sep
    		 out.print(c.getLastName()+ FIELD_SEP );
    		 out.print(c.getEmail()+ FIELD_SEP );
    	 	}
    	 return true;
    	}
    	catch (Exception e) { //read in to the file	
    		System.out.println(e);
    		return false;
    	}
    }
}