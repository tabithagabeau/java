
public abstract class Animal implements Countable{
	
	//instance variable
	protected int count;
	
	public Animal () {
		count = 1;
		}
	
	//implement the Countable interface
	@Override
	public void incrementCount () {
		count++;
		}
	@Override
	public void resetCount () {
		count=1;
		}
	@Override
	public  int getCount () {
		return count;
		}
	@Override
	public  String  getCountString () {
		return count + "animal";
		}
	}
