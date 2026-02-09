public class Calculator {\n
    private InfixCalculator infixCalculator = new InfixCalculator();
    private PostfixCalculator postfixCalculator;

    public Calculator(PostfixCalculator postfixCalculator) {
        this.postfixCalculator = postfixCalculator;
    }

    public int add(int a, int b) {
        return infixCalculator.add(a, b);
    }

    public int subtract(int a, int b) {
        return infixCalculator.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return infixCalculator.multiply(a, b);
    }

    public double divide(int a, int b) {
        return infixCalculator.divide(a, b);
    }

    public int calculate(String expression, CalculationMode mode) {
        switch (mode) {
            case INFIX:
                // Assuming InfixCalculator has a calculate method
                return infixCalculator.calculate(expression);
            case POSTFIX:
                return postfixCalculator.calculate(expression);
            default:
                throw new IllegalArgumentException("Unsupported calculation mode: " + mode);
        }
    }

    public enum CalculationMode {
        INFIX, POSTFIX
    }
}