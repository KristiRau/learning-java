import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.DisabledOnJre;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class DisabledOnJRE {
    @Test
    void testOnAllJre() {
        assertTrue(3 > 0);
    }
    @DisabledOnJre(JRE.JAVA_8)
    @Test
    void testDisableOnJava8() {
        assertTrue(6 > 4);
    }
    @DisabledOnJre(JRE.JAVA_8)
    @Test
    void testDisableOnJava9() {
        assertFalse(1 > 40);
    }
}