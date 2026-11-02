package mk.ukim.finki.aud.aud4.ex5.starters;

public class Main
{
    public static void main(String[] args)
    {
        int base = 2;
        int exponent = 10;

        PowerCalculator exercise = new PowerCalculator();
        System.out.println("Base: " + base + ", exponent: " + exponent);
        System.out.println("Version 1: " + exercise.pow(base, exponent));
        System.out.println("Version 2: " + exercise.powWithRepeatedCalls(base, exponent));
    }
}
