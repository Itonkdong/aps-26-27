package mk.ukim.finki.dataStructures.hashtable;

/**
 * A comparable key with a hash code and a second code for probing.
 *
 * @param <K> the key type
 */
public interface DoublyHashable<K> extends Comparable<K>
{
    /** @return the key's hash code */
    int hashCode();

    /** @return the code used to calculate a probing step */
    int stepCode();
}
