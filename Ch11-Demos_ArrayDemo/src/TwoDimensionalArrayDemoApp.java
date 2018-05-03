
public class TwoDimensionalArrayDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String[][] myArray = new String[3][2];
		
		for (int row=0; row < myArray.length; row++) {
			for (int col=0; col < myArray[col].length; col++) {
				myArray[row][col] = row+"-"+col;
			}
		}
		for (int row = 0; row < myArray.length; row++) {
			String rowStr = "";
			for (int col = 0; col < myArray[col].length; col++) {
				rowStr+=myArray[row][col]+";";
			}
			System.out.println(rowStr);
		}

		System.out.println("Bye");
	}

}