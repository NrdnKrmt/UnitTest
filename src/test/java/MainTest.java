import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void sumTest_whenValue4and7_expectValue11() {
        //GIVEN
        double a = 4;
        double b = 7;

        //WHEN
        double actual = Main.sum(a, b);

        //THEN
        assertEquals(11, actual);
    }

    @Test
    public void isEvenTest_whenValue4point7_expectFalse() {
        //GIVEN
        double a = 4.7;

        //WHEN
        boolean actual = Main.isEven(a);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void productTest_whenValue4and7_expectValue28() {
        //GIVEN
        double a = 4;
        double b = 7;

        //WHEN
        double actual = Main.product(a, b);

        //WHEN
        assertEquals(28, actual);
    }

    @Test
    public void toUppercaseTest_hello_HELLO() {
        //GIVEN
        String x = "hello";

        //WHEN
        String actual = Main.makeUppercase(x);

        //THEN
        assertEquals("HELLO", actual);
    }

    @Test
    public void isPositive_whenValue47_expectTrue() {
        //GIVEN
        double a = 47;

        //WHEN
        boolean actual = Main.isPositive(a);

        //THEN
        assertTrue(actual);
    }
}