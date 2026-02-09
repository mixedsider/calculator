import unittest
from evaluator import Evaluator

class TestEvaluator(unittest.TestCase):

    def setUp(self):
        self.evaluator = Evaluator()

    def test_evaluate_expression_simple(self):
        self.assertEqual(self.evaluator.evaluate_expression("2+2"), 4)

    def test_evaluate_expression_with_floats(self):
        self.assertEqual(self.evaluator.evaluate_expression("2.5+2.5"), 5.0)

    def test_evaluate_expression_complex(self):
        self.assertEqual(self.evaluator.evaluate_expression("2*3+4/2"), 8.0)

    def test_evaluate_expression_parentheses(self):
        self.assertEqual(self.evaluator.evaluate_expression("(2+3)*2"), 10)

    def test_evaluate_expression_invalid_operator(self):
        with self.assertRaises(Exception):
            self.evaluator.evaluate_expression("2$2")

    def test_evaluate_expression_division_by_zero(self):
        with self.assertRaises(ZeroDivisionError):
            self.evaluator.evaluate_expression("10/0")

if __name__ == '__main__':
    unittest.main()
