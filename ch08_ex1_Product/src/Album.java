
public class Album extends Product {
	
	private String artist; //add a new instance of the subclass
	
	public Album () {
		super(); //call a construct of the Product superclass
		artist = " ";
		count++;
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return super.toString() + "by" + artist;
	}
	
	
}
