package mk.ukim.finki.aud.aud4.ex1.solved;

import mk.ukim.finki.aud.aud4.ex1.solved.Point;

/**
 * <h2>Exercise 1: Finding the Closest Pair of Points</h2>
 *
 * <h3>Description</h3>
 * <p>Given N points, where N is at least 2, in two-dimensional space,
 * calculate the smallest Euclidean distance between two points.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Points: (0, 0), (3, 4), (1, 0)
 * Expected minimum distance: 1.0
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Algorithms Techniques, problem 1
 * (presentations/eng/04_Algorithms_Techniques.pdf, pages 3-5).
 * The sample points were added for testing.</p>
 */
public class ClosestPoints
{
    /**
     * Calculates the Euclidean distance between two points.
     *
     * @param first  the first point
     * @param second the second point
     * @return the distance between the points
     */
    public double distance(Point first, Point second)
    {
        return Math.sqrt(Math.pow(first.x - second.x, 2) + Math.pow(first.y - second.y, 2));
    }

    /**
     * Finds the smallest distance between two distinct points in the array.
     *
     * @param points the array of at least two points
     * @return the smallest pairwise distance
     */
    public double minimumDistance(Point[] points)
    {
        double minDistance = 100000;
        for (int i = 0; i < points.length; i++)
        {
            for (int j = i + 1; j < points.length; j++)
            {
                double distance = distance(points[i], points[j]);
                if (distance < minDistance)
                {
                    minDistance = distance;
                }
            }
        }

        return minDistance;
    }
}
