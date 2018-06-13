
public class OddNumbers {


	static int[] oddNumbers(int l, int r) {

		int arraySize;
		if (l%2==1 && r%2==1){
			arraySize=(r-l+2)/2;
		}
		else {
			arraySize=(r-l+1)/2;
		}

		int [] arr = new int [arraySize];
        
        arr[0]=l;

		if (l%2==1); {
			for (int i=1; i<arr.length; i++) {

				arr[i]=l+1;
			}

			return arr;	 
		}
	}
}


