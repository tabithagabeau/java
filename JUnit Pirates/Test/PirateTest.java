import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void testCreatePirate() {
		Pirate p = new Pirate("Davy Jones");
		assertEquals("Davy Jones", p.getName());
		assertEquals(4, p.getLimbsRemaining());
	
	}

	@Test
	public void testCreateOctoPirate() {
		Pirate p = new Pirate("Octopus Pete", 8);
		assertEquals("Octopus Pete", p.getName());
		assertEquals(8, p.getLimbsRemaining());
	
	}
	
	@Test (expected=NullPointerException.class)
	public void testnullpirate() {
		Pirate p = null;
		p.loseALimb();
	}
	
//	@Test
//	public void testSetName() {
//		Pirate p = new Pirate("Long John Silver");
//		assertEquals("Long John Silver");
//		p.setName("Short Jone Name")
//		assertEquals("Short Jone Name"));
//	}
	
	@Test
	public void testLoseLimb() {
		Pirate p = new Pirate("Stubby Jones");
		assertEquals(4, p.getLimbsRemaining());
		p.loseALimb();
		assertEquals(3, p.getLimbsRemaining());
	}
}
