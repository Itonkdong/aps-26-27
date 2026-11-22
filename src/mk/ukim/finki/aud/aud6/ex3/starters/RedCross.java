package mk.ukim.finki.aud.aud6.ex3.starters;

import mk.ukim.finki.dataStructures.hashtable.OBHT;
import mk.ukim.finki.dataStructures.hashtable.MapEntry;

/**
 * <h2>Exercise 3: Red Cross</h2>
 *
 * <h3>Description</h3>
 * <p>A humanitarian organization needs statistics about the blood groups
 * available for donation. Given pairs of donor names and blood groups,
 * report how many donors belong to each blood group. Subgroups A1+ and A2+
 * belong to A+, while A1- and A2- belong to A-.</p>
 *
 * <h3>Example</h3>
 * <pre>
 * Donors:
 * Alek A1+
 * Dejan B-
 * Sandra A+
 * Trajce 0+
 * Rebeka A1-
 *
 * Result:
 * A+ = 2
 * B- = 1
 * 0+ = 1
 * A- = 1
 * </pre>
 *
 * <h3>Source</h3>
 * <p>05_Heshiranje.pdf, pages 29-31.</p>
 */
public class RedCross
{
    /**
     * Counts the donors in each blood group.
     *
     * @param donors the donor and blood-group pairs
     * @return a table containing a donor count for each blood group present
     */
    public OBHT<String, Integer> countByBloodGroup(Donor[] donors)
    {
        // TODO: Implement this method.
        return new OBHT<>(11);
    }
}
