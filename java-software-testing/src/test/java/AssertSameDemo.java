import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;
    public class AssertSameDemo {
        @Test
        public void testAssertSameWithSameObject() {
            String actual = "hello";
            String expected = "hello";
            assertSame(expected, actual);
        }
        @Test
        public void testAssertSameWithDifferentObject() {
            String actual = "hello";
            String expected = "hello";
            assertSame(expected, actual);
        }
        @Test
        public void testAssertSameWithDifferentIntObject() {
            int actual = 1;
            int expected = 1;
            assertSame(expected, actual);
        }
    }

