
public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//practice return index
//		String name = "Martin Van Buren";
//		int index1 = name.lastIndexOf("Van");
//		System.out.println(index1);

		//retrieve this name in reverse order like III Smith R. James (use split method)
		String name = "James R Smith III";
		//1.Split the String into an array using a Spece + .Split() Method
		//2.Build the string by each poition in the array in reverse order paage 427 last example
		String [] nameArray = name.split(" ");// remember to have " " not "" otherwise it will not find it
		String finalString = nameArray[3] + " "+ nameArray[2] + " "+ nameArray[1] +" "+ nameArray[0]; //we could have used a decrementing for loop
		System.out.println(finalString);
		
		
	}

}
