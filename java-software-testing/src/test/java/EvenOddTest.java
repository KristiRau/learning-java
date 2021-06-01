import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenOddTest {

    @Test
    void isNumberEvenTest_whenReturnTrue() {
        Assertions.assertTrue(EvenOdd.isNumberEven(10));
    }
    @Test
    void isNumberEvenTest_whenReturnFalse() {
        Assertions.assertFalse(EvenOdd.isNumberEven(11));
    }

}
