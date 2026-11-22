package mk.ukim.finki.dataStructures.hashtable;

/**
 * An open-bucket hash table using double hashing.
 *
 * @param <K> the key type supplying both hash and step codes
 * @param <E> the value type
 */
public class DoublyHashedOBHT<K extends DoublyHashable<K>, E> extends OBHT<K, E>
{
    public DoublyHashedOBHT(int bucketCount)
    {
        super(bucketCount);
    }

    @Override
    protected int step(K key)
    {
        int increment = Math.floorMod(key.stepCode(), capacity());
        if (increment == 0)
            increment = 1;

        // A coprime step allows probing to reach every bucket.
        while (greatestCommonDivisor(increment, capacity()) != 1)
            increment++;
        return increment;
    }

    private int greatestCommonDivisor(int first, int second)
    {
        while (second != 0)
        {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }

    @Override
    protected OBHT<K, E> createEmptyTable()
    {
        return new DoublyHashedOBHT<>(capacity());
    }

    @Override
    public DoublyHashedOBHT<K, E> clone()
    {
        return (DoublyHashedOBHT<K, E>) super.clone();
    }
}
