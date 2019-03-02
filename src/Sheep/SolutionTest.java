package Sheep;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

class SolutionCheck {
  public static String countingSheep(int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      result.append(i + " sheep...");
    }
    return result.toString();
  }
}

public class SolutionTest {
    @Test
    public void setTests() {
        assertEquals("1 sheep...", Exercize.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Exercize.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Exercize.countingSheep(3));
    }
    
    @Test
    public void randomTests() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        assertEquals(SolutionCheck.countingSheep(randomNum), Exercize.countingSheep(randomNum));
    }
}