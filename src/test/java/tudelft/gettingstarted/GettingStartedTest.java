package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {
	
	//Object/Method creation
	GettingStarted g = new GettingStarted();
	
    @Test
    public void addFiveToTwenty() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }
}
