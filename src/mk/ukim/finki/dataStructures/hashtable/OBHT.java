package mk.ukim.finki.dataStructures.hashtable;

/**
 * A fixed-capacity open-bucket hash table using linear probing.
 *
 * @param <K> the comparable key type
 * @param <E> the value type
 */
public class OBHT<K extends Comparable<K>, E>
{
    public static final int NONE = -1;

    private final MapEntry<K, E>[] buckets;
    private final MapEntry<K, E> former = new MapEntry<>(null, null);
    private int size;

    /**
     * Creates an empty table.
     *
     * @param bucketCount the positive number of buckets
     */
    @SuppressWarnings("unchecked")
    public OBHT(int bucketCount)
    {
        if (bucketCount <= 0)
            throw new IllegalArgumentException("The number of buckets must be positive.");
        buckets = (MapEntry<K, E>[]) new MapEntry<?, ?>[bucketCount];
    }

    private int hash(K key)
    {
        return Math.floorMod(key.hashCode(), buckets.length);
    }

    protected int step(K key)
    {
        return 1;
    }

    /** @return the number of entries currently stored */
    public int size()
    {
        return size;
    }

    /** @return the number of buckets */
    public int capacity()
    {
        return buckets.length;
    }

    /**
     * Reads an occupied bucket.
     *
     * @param index the bucket index
     * @return the entry, or null if the bucket is empty or previously occupied
     */
    public MapEntry<K, E> getBucket(int index)
    {
        MapEntry<K, E> entry = buckets[index];
        return entry == former ? null : entry;
    }

    /**
     * Finds an entry by key.
     *
     * @param key the key to find
     * @return its bucket index, or {@link #NONE} if the key is absent
     */
    public int search(K key)
    {
        int bucket = hash(key);
        int increment = step(key);
        for (int visited = 0; visited < buckets.length; visited++)
        {
            MapEntry<K, E> entry = buckets[bucket];
            if (entry == null)
                return NONE;
            if (entry != former && entry.key.equals(key))
                return bucket;
            bucket = (bucket + increment) % buckets.length;
        }
        return NONE;
    }

    /**
     * Inserts a key-value pair, replacing the value if the key exists.
     *
     * @param key the entry key
     * @param value the value to store
     * @throws IllegalStateException if a new key cannot fit in the table
     */
    public void insert(K key, E value)
    {
        int bucket = hash(key);
        int increment = step(key);
        int free = NONE;
        for (int visited = 0; visited < buckets.length; visited++)
        {
            MapEntry<K, E> entry = buckets[bucket];
            if (entry == null)
            {
                if (free == NONE)
                    free = bucket;
                break;
            }
            if (entry == former)
            {
                if (free == NONE)
                    free = bucket;
            }
            else if (entry.key.equals(key))
            {
                buckets[bucket] = new MapEntry<>(key, value);
                return;
            }
            bucket = (bucket + increment) % buckets.length;
        }

        if (free == NONE)
            throw new IllegalStateException("The hash table is full.");
        buckets[free] = new MapEntry<>(key, value);
        size++;
    }

    /**
     * Removes an entry if its key exists.
     *
     * @param key the key to remove
     */
    public void delete(K key)
    {
        int bucket = search(key);
        if (bucket != NONE)
        {
            buckets[bucket] = former;
            size--;
        }
    }

    protected OBHT<K, E> createEmptyTable()
    {
        return new OBHT<>(buckets.length);
    }

    /**
     * Copies the table entries and bucket states. Keys and values are shared.
     *
     * @return an independent table with the same entries
     */
    @Override
    public OBHT<K, E> clone()
    {
        OBHT<K, E> copy = createEmptyTable();
        for (int i = 0; i < buckets.length; i++)
        {
            MapEntry<K, E> entry = buckets[i];
            if (entry == former)
                copy.buckets[i] = copy.former;
            else if (entry != null)
                copy.buckets[i] = new MapEntry<>(entry.key, entry.value);
        }
        copy.size = size;
        return copy;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < buckets.length; i++)
        {
            result.append(i).append(':');
            if (buckets[i] == former)
                result.append("former");
            else if (buckets[i] != null)
                result.append(buckets[i]);
            result.append('\n');
        }
        return result.toString();
    }
}
