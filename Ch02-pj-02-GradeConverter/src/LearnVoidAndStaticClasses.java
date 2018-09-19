
public class LearnVoidAndStaticClasses {

	public static void main(String[] args) {
		// Static method must belong to a class - belongs to class "LearnVoidAndStaticClasses"
		//void returns nothing -- you can print but other than that, it will return nothing
		int num1 = 5;
		int num2 = 7;
		int sum = num1 + num2;
		System.out.println("the sum of the two numbers is:" + sum);

	}
	public static int sum(int num1, int num2){
		int sum = num1 + num2;		
		return sum;

	}
}
