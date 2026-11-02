package mk.ukim.finki.aud.aud4.ex3.starters;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] coins = {50, 10, 5, 2, 1};
        int sum = 93;
        int[] coinCounts = new int[coins.length];

        CoinChange exercise = new CoinChange();
        System.out.println("Sum: " + sum);
        System.out.println("Minimum number of coins: " + exercise.minimumCoins(coins, sum, coinCounts));
        System.out.println("Coin values: " + Arrays.toString(coins));
        System.out.println("Coin counts: " + Arrays.toString(coinCounts));
    }
}
