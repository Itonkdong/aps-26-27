package mk.ukim.finki.aud.aud6.ex2.solved;

import mk.ukim.finki.dataStructures.hashtable.CBHT;
import mk.ukim.finki.dataStructures.hashtable.MapEntry;
import mk.ukim.finki.dataStructures.sll.SLLNode;

/**
 * <h2>Exercise 2: Best Offer</h2>
 *
 * <h3>Description</h3>
 * <p>A world-famous lecturer receives offers to give lectures. Each offer
 * specifies a date, starting time, city, and fee in dollars. For a given
 * date, find the lecture that would earn the highest fee. If there are no
 * offers for that date, report {@code No offers}.</p>
 *
 * <h3>Example</h3>
 * <pre>
 * Date         Time   City          Fee
 * 27/01/2016   14:00  NewYork       6000
 * 28/01/2016   08:00  Paris         3000
 * 28/01/2016   14:00  Munich        5000
 * 27/01/2016   09:00  Beijing       8000
 * 27/01/2016   08:00  Seattle       4000
 * 28/01/2016   09:00  SaltLakeCity  10000
 * 28/01/2016   09:00  Lagos         12000
 *
 * Query date: 27/01/2016
 * Result: 09:00 Beijing 8000
 * </pre>
 *
 * <h3>Source</h3>
 * <p>05_Heshiranje.pdf, pages 17-21.</p>
 */
public class BestOffer
{
    /**
     * Finds the highest-paying lecture for the requested date.
     *
     * @param offers the available lecture offers
     * @param date the query date in dd/mm/yyyy format
     * @return a highest-paying offer for the date, or null if none exists
     */
    public Lecture findBest(Lecture[] offers, String date)
    {
        // TODO: Implement this method.
        return null;
    }
}
