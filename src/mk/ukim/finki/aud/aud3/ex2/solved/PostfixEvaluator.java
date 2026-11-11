package mk.ukim.finki.aud.aud3.ex2.solved;

import mk.ukim.finki.dataStructures.stack.LinkedStack;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>Exercise 2: Evaluating a Postfix Expression</h2>
 *
 * <h3>Description</h3>
 * <p>Write an algorithm that evaluates an expression in postfix notation.
 * This exercise is marked as homework in the presentation.</p>
 *
 * <h3>Input and Result</h3>
 * <p>The supplied legacy example uses single-digit operands, optional spaces,
 * and the operators {@code +}, {@code -}, {@code *}, {@code x}, and {@code /}.
 * Both {@code *} and {@code x} denote multiplication. Use floating-point
 * arithmetic and the provided {@link LinkedStack}.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Expression: 5  9 + 2 * 6 5 * +
 * Expected result after implementation: 58.0
 * </pre>
 * <p>The current scaffold returns null until the method is implemented.</p>
 *
 * <h3>Source</h3>
 * <p>One-Dimensional Data Structures, exercise 2
 * (03_Ednodimenzionalni_podatocni_strukturi.pdf, page 18),
 * with input conventions from the legacy CalcPostfix.java.</p>
 */
public class PostfixEvaluator
{
    /**
     * Evaluates a postfix expression.
     *
     * @param expression the postfix expression to evaluate
     * @return the computed value, or null if the expression is invalid
     */
    public Double evaluateExpression(String expression)
    {
        String[] value = expression.split("\\s+");

        LinkedStack<Double> stack = new LinkedStack<>();

        ArrayList<String> operators = new ArrayList<>(List.of("+", "-", "/", "*", "x"));

        for (String element : value)
        {
            if (!operators.contains(element))
            {
                stack.push(Double.parseDouble(element));
            }
            else
            {
                Double result = evaluateExpression(stack.pop(), stack.pop(), element);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public Double evaluateExpression(Double number1, Double number2, String operator)
    {

        return switch (operator)
        {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*", "x" -> number1 * number2;
            case "/" -> number1 / number2;
            default -> 0.0;
        };

    }
}
