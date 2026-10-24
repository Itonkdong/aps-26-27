package mk.ukim.finki.aud.aud3.ex1.solved;

public class Main
{
    public static void main(String[] args)
    {
        String expression = "s x (s - a) x (s - b) x (s - c)";
        // String expression = "s x (s - a) x s - b) x (s - c)";

        BracketValidator exercise = new BracketValidator();
        System.out.println("Expression: " + expression);
        System.out.println("Array stack: "
                + (exercise.hasValidBracketsArray(expression) ? "valid" : "invalid")
                + " brackets.");
        System.out.println("Linked stack: "
                + (exercise.hasValidBracketsLinked(expression) ? "valid" : "invalid")
                + " brackets.");
    }
}
