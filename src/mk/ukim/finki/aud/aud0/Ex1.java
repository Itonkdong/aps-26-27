package mk.ukim.finki.aud.aud0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

interface Stack
{
    String push();
    String pop();
}

interface Drinkable
{
    void drink();
}

class Drink implements Drinkable
{
    private int amount;
    private float price;

    @Override
    public String toString()
    {
        return "Drink{" +
                "amount=" + amount +
                ", price=" + price +
                '}';
    }


    @Override
    public void drink()
    {
        System.out.println("Drinking...");
    }
}

class Coffee extends Drink
{
    private Drink drink;

    public Coffee()
    {
        super();
        this.drink = null;
    }
}

class Box<T>
{
    private T value;

    public Box(T value)
    {
        this.value = value;
    }
}

class OtherBox
{
    private Object value;

    public OtherBox(Object value)
    {
        this.value = value;
    }
}

class MyList<T>
{
    public ArrayList<T> mylist;
}

public class Ex1
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello world");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Integer integer = Integer.valueOf(line);
        System.out.println(integer);

        int[] array = {1,2 ,3};

        for (int element : array)
        {
            System.out.println(element);
        }
        

        ArrayList<Integer> myList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        
        Box<Coffee> drinkBox = new Box<Coffee>(new Coffee());
        
        Box<Coffee> otherBox = new Box<Coffee>(new Coffee());

        ArrayList<Integer> integers = new ArrayList<>();


        String myLine = reader.readLine();

        int[] array1 = Arrays.stream(myLine.split("\\s+"))
                .map(element -> Integer.parseInt(element))
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i : array1)
        {
            System.out.println(i);

        }
    }
}
