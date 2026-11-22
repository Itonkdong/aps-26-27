package mk.ukim.finki.aud.aud6.ex2.solved;

public class Main
{
    public static void main(String[] args)
    {
        Lecture[] offers = {
                new Lecture("27/01/2016", "14:00", "NewYork", 6000),
                new Lecture("28/01/2016", "08:00", "Paris", 3000),
                new Lecture("28/01/2016", "14:00", "Munich", 5000),
                new Lecture("27/01/2016", "09:00", "Beijing", 8000),
                new Lecture("27/01/2016", "08:00", "Seattle", 4000),
                new Lecture("28/01/2016", "09:00", "SaltLakeCity", 10000),
                new Lecture("28/01/2016", "09:00", "Lagos", 12000)
        };
        runCase(1, offers, "27/01/2016", "09:00 Beijing 8000");
        runCase(2, offers, "28/01/2016", "09:00 Lagos 12000");
        runCase(3, offers, "29/01/2016", "No offers");
        runCase(4, new Lecture[]{}, "27/01/2016", "No offers");
        runCase(5, new Lecture[]{new Lecture("01/02/2016", "12:00", "Athens", 0)},
                "01/02/2016", "12:00 Athens 0");
    }

    private static void runCase(int number, Lecture[] offers, String date, String expected)
    {
        System.out.printf("Case %d: Query date %s%n", number, date);
        for (Lecture offer : offers)
        {
            System.out.println("  Offer: " + offer.getDate() + " " + offer);
        }
        Lecture result = new BestOffer().findBest(offers, date);
        String actual = result == null ? "No offers" : result.toString();
        System.out.printf("  Expected: %s | Actual: %s | %s%n",
                expected, actual, expected.equals(actual) ? "PASS" : "FAIL");
    }
}
