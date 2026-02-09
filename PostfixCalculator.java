// PostfixCalculator.java
public class PostfixCalculator {

    private PostfixEvaluator evaluator;

    public PostfixCalculator(PostfixEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    public int calculate(String expression) {
        return evaluator.evaluate(expression);
    }
}