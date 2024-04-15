import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {
    @Test
    public void testException() {
        String invalidSex = "Unknown";
        String expectedErrorMessage = "Используйте допустимые значения пола животного - самей или самка";

        try {
            new Lion(invalidSex, new Feline());
        } catch (Exception e) {
            assertEquals(expectedErrorMessage, e.getMessage());
        }
    }
    @Test
    public void checkKittensForLion() throws Exception {

        int expectedKittensCount = 1;
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actualKittensCount = lion.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);
    }
    @Test
    public void testGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);

        List<String> foodList = lion.getFood();

        assertTrue(foodList.contains("Животные"));
        assertTrue(foodList.contains("Птицы"));
        assertTrue(foodList.contains("Рыба"));
    }
}
