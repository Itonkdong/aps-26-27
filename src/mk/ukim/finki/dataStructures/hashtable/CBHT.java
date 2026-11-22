package mk.ukim.finki.dataStructures.hashtable;

import mk.ukim.finki.dataStructures.sll.SLLNode;

/**
 * A closed-bucket hash table with a linked list in each bucket.
 *
 * @param <K> the comparable key type
 * @param <E> the value type
 */
public class CBHT<K extends Comparable<K>, E>
{
    private final SLLNode<MapEntry<K, E>>[] buckets;

    /**
     * Creates an empty table.
     *
     * @param bucketCount the positive number of buckets
     */
    @SuppressWarnings("unchecked")
    public CBHT(int bucketCount)
    {
        if (bucketCount <= 0)
            throw new IllegalArgumentException("The number of buckets must be positive.");
        buckets = (SLLNode<MapEntry<K, E>>[]) new SLLNode<?>[bucketCount];
    }

    private int hash(K key)
    {
        return Math.floorMod(key.hashCode(), buckets.length);
    }

    /**
     * Finds an entry by key.
     *
     * @param key the key to find
     * @return its node, or null if the key is absent
     */
    public SLLNode<MapEntry<K, E>> search(K key)
    {
        SLLNode<MapEntry<K, E>> current = buckets[hash(key)];
        while (current != null)
        {
            if (current.element.key.equals(key))
                return current;
            current = current.succ;
        }
        return null;
    }

    /**
     * Inserts a key-value pair, replacing the value if the key exists.
     *
     * @param key the entry key
     * @param value the value to store
     */
    public void insert(K key, E value)
    {
        int bucket = hash(key);
        SLLNode<MapEntry<K, E>> current = buckets[bucket];
        while (current != null)
        {
            if (current.element.key.equals(key))
            {
                current.element = new MapEntry<>(key, value);
                return;
            }
            current = current.succ;
        }
        buckets[bucket] = new SLLNode<>(new MapEntry<>(key, value), buckets[bucket]);
    }

    /**
     * Removes an entry if its key exists.
     *
     * @param key the key to remove
     */
    public void delete(K key)
    {
        int bucket = hash(key);
        SLLNode<MapEntry<K, E>> previous = null;
        SLLNode<MapEntry<K, E>> current = buckets[bucket];
        while (current != null)
        {
            if (current.element.key.equals(key))
            {
                if (previous == null)
                    buckets[bucket] = current.succ;
                else
                    previous.succ = current.succ;
                return;
            }
            previous = current;
            current = current.succ;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < buckets.length; i++)
        {
            result.append(i).append(':');
            SLLNode<MapEntry<K, E>> current = buckets[i];
            while (current != null)
            {
                result.append(current.element).append(' ');
                current = current.succ;
            }
            result.append('\n');
        }
        return result.toString();
    }
}
