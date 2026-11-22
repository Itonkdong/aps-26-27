package mk.ukim.finki.aud.aud6.ex3.solved;

/** A donor and their reported blood group. */
public class Donor
{
    public String name;
    public String bloodGroup;

    public Donor(String name, String bloodGroup)
    {
        this.name = name;
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString()
    {
        return name + " " + bloodGroup;
    }
}
