import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CatTest {
    private String catSound = "Мяу";

    Cat cat;
    @Before
    public void setUp() {
        cat = new Cat(new Feline());
    }

    @Test
    public void testGetCatSound() {

        assertEquals(catSound, cat.getSound());
    }

    @Test
    public void realPredator() throws Exception {
        List<String> actualFood = cat.getFood();
        assertTrue(actualFood.contains("Птицы"));
    }

}
