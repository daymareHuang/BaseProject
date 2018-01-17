package checkSchedule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jaunt.JauntException;

class CheckScheduleTest {

	CheckSchedule check = new CheckSchedule();
	@Test
	public void testIfChooseOne() {
		try {
			CheckSchedule.check();
		} catch (JauntException e) {
			e.printStackTrace();
		}
	}
	
	

}
