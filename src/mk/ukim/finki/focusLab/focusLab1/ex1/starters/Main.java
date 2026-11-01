package mk.ukim.finki.focusLab.focusLab1.ex1.starters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        String[] lines = new String[n];
        for (int i = 0; i < n; i++)
        {
            lines[i] = reader.readLine();
        }

        ConfigurationValidator exercise = new ConfigurationValidator();
        System.out.println(exercise.isValid(lines));
    }
}
