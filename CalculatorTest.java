import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator(null);
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(1, -2));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator(null);
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(3, calculator.subtract(1, -2));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator(null);
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(1, -2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator(null);
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-0.5, calculator.divide(1, -2));
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    void divideByZero() {
        Calculator calculator = new Calculator(null);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void calculatePostfix() {
        PostfixEvaluator evaluator = mock(PostfixEvaluator.class);
        when(evaluator.evaluate("2 3 +")).thenReturn(5);
        PostfixCalculator postfixCalculator = new PostfixCalculator(evaluator);
        Calculator calculator = new Calculator(postfixCalculator);
        assertEquals(5, calculator.calculate("2 3 +", Calculator.CalculationMode.POSTFIX));
        verify(evaluator).evaluate("2 3 +");
    }

    @Test
    void calculateInfix() {
        InfixCalculator infixCalculator = mock(InfixCalculator.class);
        when(infixCalculator.calculate("2 + 3")).thenReturn(5);
        Calculator calculator = new Calculator(new PostfixCalculator(new PostfixEvaluator())); // Dummy PostfixCalculator
        calculator.infixCalculator = infixCalculator;
        assertEquals(5, calculator.calculate("2 + 3", Calculator.CalculationMode.INFIX));
        verify(infixCalculator).calculate("2 + 3");
    }
}