package TestExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathsTest {
    Maths maths;
    @BeforeEach
    void setUp() {
        maths = new Maths();
    }

    @Test
    void square() {
        double res = maths.square(6);
        Assertions.assertEquals(36, res);
    }

    @Test
    void subtract() {
        double res = maths.subtract(6, 9);
        Assertions.assertEquals(-3, res);
    }
}