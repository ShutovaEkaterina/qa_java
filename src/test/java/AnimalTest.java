import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalTest {
    @Test
    public void testExceptionAnimal() {
        String invalidAnimalKind = "Всеядный";
        String expectedErrorMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        try {
            Animal animal = new Animal();
            animal.getFood(invalidAnimalKind);
        } catch (Exception e) {
            assertEquals(expectedErrorMessage, e.getMessage());
        }
    }
    @Test
    public void testFamilyStringStartsWith() {
        Animal animal = new Animal();
        String family = animal.getFamily();
        assertTrue(family.startsWith("Существует несколько семейств:"));
    }
}
