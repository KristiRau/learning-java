import org.junit.jupiter.api.*;

public class StringUtilsTest {

    /*
    Use cases:
        1. the function reverse returns reversed string
        - "Silver" should return "revliS"
        2. if string is null, we get null.
        3. if string is "", we get "".
        4. "akshay" should return "akshay"
        */


    @BeforeAll
    static void init() {
        System.out.println("Connection estd.");
    }
    @AfterAll
    static void shutdown() {
        System.out.println("Connection closed.");
    }
    @BeforeEach
    void start() {
        System.out.println("Started testing.");
    }
    @AfterEach
    void end() {
        System.out.println("Finished testing this method.");
    }

    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned() {
        String reverse = StringUtils.reverse(null);
        System.out.println("executed 1");
        Assertions.assertNull(reverse);
    }
    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned() {
        String reverse = StringUtils.reverse("");
        System.out.println("executed 2");
        assert(reverse).isEmpty();
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned() {
        String reverse = StringUtils.reverse("Silver");
        System.out.println("executed 3");
        Assertions.assertNotNull(reverse);
        Assertions.assertEquals("revliS", reverse);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenStringIsReturned() {
        String reverse = StringUtils.reverse("I don't know what to write!");
        System.out.println("executed 4");
        Assertions.assertNotNull(reverse);
    }




}
