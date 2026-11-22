package mk.ukim.finki.aud.aud6.ex3.solved;

import mk.ukim.finki.dataStructures.hashtable.MapEntry;
import mk.ukim.finki.dataStructures.hashtable.OBHT;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new Donor[]{
                new Donor("Alek", "A1+"), new Donor("Dejan", "B-"),
                new Donor("Sandra", "A+"), new Donor("Trajce", "0+"), new Donor("Rebeka", "A1-")
        }, new String[]{"A+", "B-", "0+", "A-"}, new int[]{2, 1, 1, 1});
        runCase(2, new Donor[]{
                new Donor("Ana", "A1+"), new Donor("Bojan", "A2+"), new Donor("Cvetan", "A+"),
                new Donor("Dina", "A1-"), new Donor("Elena", "A2-"), new Donor("Filip", "A-")
        }, new String[]{"A+", "A-"}, new int[]{3, 3});
        runCase(3, new Donor[]{
                new Donor("Ana", "A+"), new Donor("Bojan", "A-"), new Donor("Cvetan", "B+"),
                new Donor("Dina", "B-"), new Donor("Elena", "AB+"), new Donor("Filip", "AB-"),
                new Donor("Goran", "0+"), new Donor("Hana", "0-")
        }, new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "0+", "0-"},
                new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        runCase(4, new Donor[]{
                new Donor("Ana", "B+"), new Donor("Bojan", "B+"), new Donor("Cvetan", "B+")
        }, new String[]{"B+"}, new int[]{3});
        runCase(5, new Donor[]{}, new String[]{}, new int[]{});
    }

    private static void runCase(int number, Donor[] donors, String[] groups, int[] counts)
    {
        Map<String, Integer> expected = new TreeMap<>();
        for (int i = 0; i < groups.length; i++)
        {
            expected.put(groups[i], counts[i]);
        }

        OBHT<String, Integer> result = new RedCross().countByBloodGroup(donors);
        Map<String, Integer> actual = new TreeMap<>();
        if (result != null)
        {
            for (int i = 0; i < result.capacity(); i++)
            {
                MapEntry<String, Integer> entry = result.getBucket(i);
                if (entry != null)
                    actual.put(entry.key, entry.value);
            }
        }
        boolean passed = result != null && expected.equals(actual);
        System.out.printf("Case %d: Donors %s%n", number, Arrays.toString(donors));
        System.out.printf("  Expected: %s | Actual: %s | %s%n",
                expected, result == null ? null : actual, passed ? "PASS" : "FAIL");
    }
}
