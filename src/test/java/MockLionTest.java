import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

    @RunWith(MockitoJUnitRunner.class)
    public class MockLionTest {

        @Mock
        Lion lion;

        @Test
        public void testForLion() throws Exception {
            lion.getFood();
            lion.getFood();
            Mockito.verify(lion, Mockito.times(2)).getFood();
        }

        @Test
        public void testForLionMane() {
            lion.doesHaveMane();
            Mockito.verify(lion).doesHaveMane();
        }
    }



