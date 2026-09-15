import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
    }
}
