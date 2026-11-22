package mk.ukim.finki.dataStructures.hashtable.tester;

import mk.ukim.finki.dataStructures.hashtable.CBHT;
import mk.ukim.finki.dataStructures.hashtable.MapEntry;
import mk.ukim.finki.dataStructures.sll.SLLNode;

public class CBHTTester
{
    public static void main(String[] args)
    {
        CBHT<ChemicalElement, Integer> table = new CBHT<>(26);
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
        SLLNode<MapEntry<ChemicalElement, Integer>> found = table.search(hydrogen);
        System.out.println("Updated H: " + found.element.value);
        table.delete(hydrogen);
        System.out.println("H after deletion: " + table.search(hydrogen));
        System.out.println("He is still present: " + table.search(helium).element.value);
    }
}
