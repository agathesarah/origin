package robotproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest2 {

	@Test
	void testIsDead() {
		Robot a = new Robot("john", 10);
		Robot b = new Robot("bob",0);
		
		a.fire(b);
	}

}
