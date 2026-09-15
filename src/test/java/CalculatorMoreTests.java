import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorMoreTests {

    private final Calculator calculator = new Calculator();

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
