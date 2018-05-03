import java.io.*;

public class ResourcesTesterApp {

    public static void main(String[] args) {
        String s1 = readLineWithResources();
        String s2 = readLineWithFinally();
    }

    public static String readLineWithResources() {
        System.out.println("Starting readLineWithResources() method.");

        //moved outside the block and also check something to products.txt to test it in -4
        try (BufferedReader in = new BufferedReader(new FileReader("products.txt"))){
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null; //return to where it was called from originally
        }
    }
 
    public static String readLineWithFinally() {
    	System.out.println("Starting readLineWithFinally() method.");
    	
    	BufferedReader in = null; // declare this outside the block
    	try  { in = new BufferedReader(new FileReader("products.txt"));
            String s = in.readLine();
            return s; //will return to first line of product.txt to s2
             
        } catch (IOException e) {
            System.out.println(e.toString());
            return null; //will not return until it runs finally
        }
        finally {
        	 if (in !=null) {
             	try {
					in.close(); //add the closing statement bc you moved outside the block above this
					//close this (BufferedReader in = new BufferedReader(new FileReader("products.txt"))) 
				} catch (IOException e) {
					// you need to add thi catch after finally
					e.printStackTrace();
				}
             }
        }
    }
}


