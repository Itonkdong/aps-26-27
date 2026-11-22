package mk.ukim.finki.dataStructures.hashtable.tester;

import mk.ukim.finki.dataStructures.hashtable.DoublyHashable;

/** A chemical-symbol key for the presentation's hash-table demonstrations. */
public class ChemicalElement implements DoublyHashable<ChemicalElement>
{
    private final String symbol;

    public ChemicalElement(String symbol)
    {
        if (symbol.isEmpty())
            throw new IllegalArgumentException("A chemical symbol cannot be empty.");
        this.symbol = Character.toString(Character.toUpperCase(symbol.charAt(0)))
                + (symbol.length() > 1 ? Character.toString(Character.toLowerCase(symbol.charAt(1))) : "");
    }

    @Override
    public int hashCode()
    {
        return symbol.charAt(0) - 'A';
    }

    @Override
    public int stepCode()
    {
        return symbol.length() == 1 ? 1 : symbol.charAt(1) - 'a' + 2;
    }

    @Override
    public int compareTo(ChemicalElement other)
    {
        return symbol.compareTo(other.symbol);
    }

    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof ChemicalElement))
            return false;
        return symbol.equals(((ChemicalElement) other).symbol);
    }

    @Override
    public String toString()
    {
        return symbol;
    }
}
