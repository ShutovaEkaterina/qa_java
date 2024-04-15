import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockFelineTest {
    @Mock
    Feline feline;

    @Test
    public void testForFeline() throws Exception {
        feline.eatMeat();
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(2)).eatMeat();
    }

    @Test
    public void testForFelineKittens() {
        feline.getKittens();
        Mockito.when(feline.getKittens()).thenReturn(4);
        feline.getKittens();
    }
}
