package robotproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArenaTest {

	@Test
	void testFight() {
		Robot r1 = new Robot("OREO",10);
		Robot r2= new Robot("OCHOCO",10);
		Arena A= new Arena (r1,r2);
		
		A.fight(r1,r2);
	}

}
