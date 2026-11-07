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
        if (row1 == row2 && column1 == column2) return  true;

        if (row1 == row2)
        {
            return true;
        }

        if (column1 == column2)
        {
            return true;
        }

        int checkRow = row1 + 1 ;
        int checkCol = column1 + 1;

        while (true)
        {
            if (checkCol < 0 || checkRow < 0 || checkRow >= 8 || checkCol >=8)
            {
                break;
            }

            if (row2 == checkRow && column2 == checkCol)
            {
                return true;
            }
            checkCol += 1;
            checkRow += 1;
        }

        checkRow = row1 - 1 ;
        checkCol = column1 + 1;

        while (true)
        {
            if (checkCol < 0 || checkRow < 0 || checkRow >= 8 || checkCol >=8)
            {
                break;
            }

            if (row2 == checkRow && column2 == checkCol)
            {
                return true;
            }
            checkCol += 1;
            checkRow -= 1;
        }


        checkRow = row1 + 1 ;
        checkCol = column1 - 1;

        while (true)
        {
            if (checkCol < 0 || checkRow < 0 || checkRow >= 8 || checkCol >=8)
            {
                break;
            }

            if (row2 == checkRow && column2 == checkCol)
            {
                return true;
            }
            checkCol -= 1;
            checkRow += 1;
        }

        checkRow = row1 - 1 ;
        checkCol = column1 - 1;

        while (true)
        {
            if (checkCol < 0 || checkRow < 0 || checkRow >= 8 || checkCol >=8)
            {
                break;
            }

            if (row2 == checkRow && column2 == checkCol)
            {
                return true;
            }
            checkCol -= 1;
            checkRow -= 1;
        }

        return  false;

    }

    /**
     * Counts ordered non-attacking placements on an 8-by-8 board.
     *
     * @return the number of ordered placements of the two queens
     */
    public int countPlacements()
    {
        int countNonAttacking = 0;
        for (int row1 = 0; row1 < 8; row1++)
        {
            for (int col1 = 0; col1 < 8; col1++)
            {
                for (int row2 = 0 ; row2 < 8; row2++)
                {
                    for (int col2 =  0; col2 < 8; col2++)
                    {
                        if (!(areAttacking(row1, col1, row2, col2)))
                        {
                            countNonAttacking ++;
                        }
                    }
                }
            }
        }

        return countNonAttacking;
    }
}
