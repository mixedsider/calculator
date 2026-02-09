from evaluator import Evaluator

class Calculator:
    def calculate(self, expression):
        evaluator = Evaluator()
        return evaluator.evaluate_expression(expression)

# Example usage:
calculator = Calculator()
result = calculator.calculate("2+2*2")
print(result)  # Output: 6
