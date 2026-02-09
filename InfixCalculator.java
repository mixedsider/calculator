// InfixCalculator.java
public class InfixCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

     public int calculate(String expression) {
        // Basic Infix Calculation (Just for demonstration)
        String[] parts = expression.split("\\s+");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid infix expression");
        }
        int operand1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int operand2 = Integer.parseInt(parts[2]);

        switch (operator) {
            case "+":
                return add(operand1, operand2);
            case "-":
                return subtract(operand1, operand2);
            case "*":
                return multiply(operand1, operand2);
            case "/":
                return (int) divide(operand1, operand2);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}