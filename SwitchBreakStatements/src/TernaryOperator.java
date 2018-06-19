
public class TernaryOperator {
	
	public static void main(String[] args) {
		//there are many ways to do ternary operator 
		
		Boolean isLocked = false;  {

			System.out.println(	isLocked ? "You will need a key to open the door." : 
					"You will not need a key to open the door.");
		}
		//2nd way
		Boolean isCorrect = true; {
		
			System.out.println(isCorrect ? "Correct!" : "Incorrect!");
		}
		
		//3rd way
		String favoritePhrase = "Love That!";{
		
		
		System.out.println(favoritePhrase == "Love That!"? "I love that!" : "I don't love that!");
				
		}
		
		boolean hamlet;
		bark( hamlet = true); {
			System.out.println (hamlet ? "To Bark!" : "Not to Bark");
			//System.out.println(result);
		}
		//there are many ways to do ternary operator 
		bark (hamlet = false);{
			if (hamlet)	{
				System.out.println("To Bark.");
			}
			else
			{
				System.out.println("Not to Bark");
			}
		}
		
	}

	private static void bark(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
