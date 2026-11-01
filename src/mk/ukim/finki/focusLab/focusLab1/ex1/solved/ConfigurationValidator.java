package mk.ukim.finki.focusLab.focusLab1.ex1.solved;

import java.util.Stack;

public class ConfigurationValidator
{
    /**
     * Checks the nesting, block names, DATA restriction, and closure of all
     * blocks in the configuration.
     *
     * @param lines the configuration file's lines in their original order
     * @return true if the configuration satisfies all three rules, or false
     *         otherwise
     */
    public boolean isValid(String[] lines)
    {
        Stack<String> openBlocks = new Stack<>();

        for (String line : lines)
        {
            String[] parts = line.trim().split("\\s+");

            if (parts[0].equals("BEGIN"))
            {
                if (parts.length != 2)
                    return false;

                if (!openBlocks.isEmpty() && openBlocks.peek().equals("DATA"))
                    return false;

                openBlocks.push(parts[1]);
            }
            else if (parts[0].equals("END"))
            {
                if (parts.length != 2 || openBlocks.isEmpty())
                    return false;

                if (!openBlocks.pop().equals(parts[1]))
                    return false;
            }
        }

        return openBlocks.isEmpty();
    }
}
