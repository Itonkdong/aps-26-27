package mk.ukim.finki.aud.aud4.ex2.solved;

/**
 * <h2>Exercise 2: Counting Non-Attacking Queen Placements</h2>
 *
 * <h3>Description</h3>
 * <p>Calculate the number of ways two queens can be placed on an 8-by-8
 * chessboard without attacking each other. Two queens attack each other
 * when they are in the same row, column, or diagonal.</p>
 *
 * <h3>Counting Convention</h3>
 * <p>The queens are distinguishable. Swapping their positions counts
 * as another placement.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Board: 8 by 8
 * Expected number of placements: 2576
 * </pre>
 *
 * <h3>Source</h3>
 * <p>Algorithms Techniques, problem 2
 * (presentations/eng/04_Algorithms_Techniques.pdf, pages 6-8).</p>
 */
public class NonAttackingQueens
{
    /**
     * Checks whether queens on two given squares attack each other.
     *
     * @param row1 the first queen's row, from 0 to 7
     * @param column1 the first queen's column, from 0 to 7
     * @param row2 the second queen's row, from 0 to 7
     * @param column2 the second queen's column, from 0 to 7
     * @return whether the queens share a row, column, or diagonal
     */
    public boolean areAttacking(int row1, int column1, int row2, int column2)
    {
        // TODO: Implement this method.
        return false;
    }

    /**
     * Counts ordered non-attacking placements on an 8-by-8 board.
     *
     * @return the number of ordered placements of the two queens
     */
    public int countPlacements()
    {
        // TODO: Implement this method.
        return 0;
    }
}
