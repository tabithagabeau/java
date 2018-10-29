
public abstract class Animal implements Countable {
	
 protected int count;
 
 public Animal() {
	count=1;
}
@Override
 public int getCount() {
	return count;
 }
 @Override
 public void incrementCount() {
	count++;
 }
 @Override
 public void resetCount() {
	count=1;
 }
 @Override
 public String getCountString() {
	return(count +"animal");
 }
}
