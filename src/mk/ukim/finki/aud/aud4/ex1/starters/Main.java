package mk.ukim.finki.aud.aud4.ex1.starters;

public class Main
{
    public static void main(String[] args)
    {
        Point[] points = {
                new Point(0, 0),
                new Point(3, 4),
                new Point(1, 0)
        };

        ClosestPoints exercise = new ClosestPoints();
        System.out.println("Minimum distance: " + exercise.minimumDistance(points));
    }
}
