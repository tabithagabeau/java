import java.io.*;
import java.nio.*;

public class FileIODemoWriter {

	public static void main(String[] args) {
		
	try ( PrintWriter out =new PrintWriter(new BufferedWriter(new FileWriter("ProductsKHA"))))
	{ //write out to the file
		out.print("Code\t");
		out.print("description");
		out.println("Price");
		out.print("Java\t");
		out.print("Murach Java Programming");
		out.println("55.07");
	}
	catch (Exception e) { //read in to the file	
		System.out.println();
	}
		{
	try ( BufferedReader in =new BufferedReader(new FileReader("ProductsKHA")) ){
	 String line =in.readLine();
			
	while (line != null)	{
		System.out.println(line);
		line =in.readLine();
			}
		} catch (IOException e) {
			System.out.println(e);
			return;
		}
	}
}
}
