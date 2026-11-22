package mk.ukim.finki.dataStructures.hashtable;

/**
 * A key-value pair stored in a hash table.
 *
 * @param <K> the comparable key type
 * @param <E> the value type
 */
public class MapEntry<K extends Comparable<K>, E>
{
    public K key;
    public E value;

    public MapEntry(K key, E value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "<" + key + "," + value + ">";
    }
}
