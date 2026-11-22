package mk.ukim.finki.dataStructures.hashtable.tester;

import mk.ukim.finki.dataStructures.hashtable.OBHT;

public class OBHTTester
{
    public static void main(String[] args)
    {
        OBHT<ChemicalElement, Integer> table = new OBHT<>(26);
        String[] symbols = {"H", "He", "Li", "Be", "Na", "Mg", "K", "Ca", "Rb", "Sr", "Cs", "Ba"};
        int[] atomicNumbers = {1, 2, 3, 4, 11, 12, 19, 20, 37, 38, 55, 56};
        for (int i = 0; i < symbols.length; i++)
        {
            table.insert(new ChemicalElement(symbols[i]), atomicNumbers[i]);
        }
        System.out.println("Chemical elements:");
        System.out.println(table);

        ChemicalElement hydrogen = new ChemicalElement("H");
        ChemicalElement helium = new ChemicalElement("He");
        table.insert(hydrogen, 100);
        System.out.println("Updated H: " + table.getBucket(table.search(hydrogen)).value);
        table.delete(hydrogen);
        System.out.println("H after deletion: " + table.search(hydrogen));
        System.out.println("He is still present: " + table.getBucket(table.search(helium)).value);

        OBHT<ChemicalElement, Integer> copy = table.clone();
        copy.insert(hydrogen, 1);
        System.out.println("H restored in clone: " + copy.getBucket(copy.search(hydrogen)).value);
        System.out.println("H remains absent in original: " + (table.search(hydrogen) == OBHT.NONE));
        System.out.println("Original table size: " + table.size());
    }
}
