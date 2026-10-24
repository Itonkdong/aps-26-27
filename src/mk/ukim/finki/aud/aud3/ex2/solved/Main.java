package mk.ukim.finki.aud.aud3.ex2.solved;

public class Main
{
    public static void main(String[] args)
    {
        String expression = "5  9 + 2 * 6 5 * +";
        PostfixEvaluator exercise = new PostfixEvaluator();
        System.out.println("Result: " + exercise.evaluate(expression));
    }
}
