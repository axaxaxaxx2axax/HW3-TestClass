import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumWith1() {
        int actual = sumCalculator.sum(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void testSumWith3() {
        int actual = sumCalculator.sum(3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void testSumWith0() {
        assertThrows(IllegalArgumentException.class, () ->
            sumCalculator.sum(0)
        );
    }
}
