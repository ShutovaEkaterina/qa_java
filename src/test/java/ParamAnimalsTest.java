import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamAnimalsTest {
    private final String animalKind;
    private final List<String> eatingFood;
    public ParamAnimalsTest(String animalKind, List<String> eatingFood) {
        this.animalKind = animalKind;
        this.eatingFood = eatingFood;
    }

    @Parameterized.Parameters
    public static Object[] getTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void whoWhatEat() throws Exception {
        Animal animal = new Animal();
        assertEquals(eatingFood, animal.getFood(animalKind));
    }
}
