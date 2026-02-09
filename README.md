## Project Title: Calculator

### Description
This project implements a simple calculator that supports both infix and postfix notation. It includes basic arithmetic operations such as addition, subtraction, multiplication, and division.

### Usage

#### Running the Calculator

1.  **Compilation:**

    ```bash
    javac *.java
    ```

2.  **Execution:**

    ```bash
    java Calculator
    ```

#### Example Usage

*   **Infix Calculation:**

    ```java
    Calculator calculator = new Calculator(new PostfixCalculator(new PostfixEvaluator()));
    int result = calculator.calculate("2 + 3", Calculator.CalculationMode.INFIX);
    System.out.println(result); // Output: 5
    ```

*   **Postfix Calculation:**

    ```java
    PostfixEvaluator evaluator = new PostfixEvaluator();
    PostfixCalculator postfixCalculator = new PostfixCalculator(evaluator);
    Calculator calculator = new Calculator(postfixCalculator);
    int result = calculator.calculate("2 3 +", Calculator.CalculationMode.POSTFIX);
    System.out.println(result); // Output: 5
    ```

### Code Structure

*   **`Calculator.java`**: Main class that provides the interface for performing calculations. It supports both infix and postfix modes.
*   **`InfixCalculator.java`**: Handles infix calculations.
*   **`PostfixCalculator.java`**: Handles postfix calculations.
*   **`PostfixEvaluator.java`**: Evaluates postfix expressions.

### Contributing

We follow the Gitflow workflow for contributions:

1.  Create a feature branch from `develop`:

    ```bash
    git checkout -b AI_feat/<feature-name> develop
    ```

2.  Implement your changes and write appropriate unit tests.

3.  Commit your changes with a descriptive message following the Conventional Commits format:

    ```bash
    git commit -m "feat(component): add new feature"
    ```

4.  Push your branch to origin:

    ```bash
    git push origin AI_feat/<feature-name>
    ```

5.  Create a pull request targeting the `develop` branch.

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.