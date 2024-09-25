import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void sumTest() {
        //GIVEN
        double a = 4;
        double b = 7;

        //WHEN
        double actual = Main.sum(a, b);

        //THEN
        assertEquals(11, actual);
    }

    @Test
    public void isEvenTest() {
        //GIVEN
        double a = 4.7;

        //WHEN
        boolean actual = Main.isEven(a);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void productTest() {
        //GIVEN
        double a = 4;
        double b = 7;

        //WHEN
        double actual = Main.product(a, b);

        //WHEN
        assertEquals(28, actual);
    }

    @Test
    public void toUppercaseTest() {
        //GIVEN
        String x = "hallo";

        //WHEN
        String actual = Main.makeUppercase(x);

        //THEN
        assertEquals("HALLO", actual);
    }

    @Test
    public void isPositive() {
        //GIVEN
        double a = 47;

        //WHEN
        boolean actual = Main.isPositive(a);

        //THEN
        assertTrue(actual);
    }
}