import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(1, -2));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(3, calculator.subtract(1, -2));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(1, -2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-0.5, calculator.divide(1, -2));
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    void divideByZero() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}