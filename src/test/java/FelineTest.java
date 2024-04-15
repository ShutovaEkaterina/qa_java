import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FelineTest {
    @Test
    public void checkKittensCount() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, actualKittensCount);
    }
    @Test
    public void checkNameFamily() {
        Feline feline = new Feline();
        String expectedStart = "Кош";
        String actualFamily = feline.getFamily();
        assertTrue(actualFamily.startsWith(expectedStart));
    }
    @Test
    public void checkPredatorWord() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные"));
    }
}
