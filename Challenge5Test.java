package Challenge5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Challenge5Test {

	@Test
    public void testChallengeString1() {
		String result = new Challenge5().getGridStatus("[\".......\",\".......\",\".R.....\",\".r.....\",\".ry....\",\".ryyy..\"]");
        assertEquals("Red wins", result);
    }
	
	@Test
    public void testChallengeString2() {
		String result = new Challenge5().getGridStatus("[\".......\",\".......\",\".......\",\".yy....\",\".rrRr..\",\".ryyy..\"]");
        assertEquals("Red wins", result);
    }

	@Test
    public void testChallengeString3() {
		String result = new Challenge5().getGridStatus("[\".......\",\".......\",\"....r..\",\"...ry..\",\"..Ryr..\",\".ryyyr.\"]");
        assertEquals("Red wins", result);
    }
	
	@Test
    public void testChallengeString4() {
		String result = new Challenge5().getGridStatus("[\".......\",\".......\",\"...y...\",\"...ry..\",\"...ryy.\",\"...rrrY\"]");
        assertEquals("Yellow wins", result);
    }
	
	@Test
    public void testChallengeString5() {
		String result = new Challenge5().getGridStatus("[\".......\",\".......\",\".......\",\"...ry..\",\"...ryy.\",\"..yrrrY\"]");
        assertEquals("Red plays next", result);
    }
	
	@Test
    public void testChallengeString6() {
		String result = new Challenge5().getGridStatus("[\".......\",\".......\",\".......\",\"...ry..\",\"..Rryy.\",\"..yrrry\"]");
        assertEquals("Yellow plays next", result);
    }
}