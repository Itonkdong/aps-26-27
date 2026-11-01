package mk.ukim.finki.focusLab.focusLab1.ex1.starters;

import mk.ukim.finki.dataStructures.stack.LinkedStack;

/**
 * <h2>Exercise 1: Validating Configuration Blocks</h2>
 *
 * <h3>Description</h3>
 * <p>A configuration file is organized into named blocks. Each block opens
 * with {@code BEGIN <name>} and closes with {@code END <name>}. Blocks may
 * be nested, and regular content lines may appear inside or between them.
 * Any line that is not a BEGIN or END command is regular content.</p>
 * <p>Determine whether the file satisfies all three rules:</p>
 * <ul>
 *     <li>Each {@code END <name>} must close the most recently opened block,
 *     and the names must match exactly.</li>
 *     <li>A block named {@code DATA} cannot contain nested blocks. While a
 *     DATA block is open, no BEGIN command may appear until it closes.
 *     Regular content inside DATA is allowed.</li>
 *     <li>All opened blocks must be closed by the end of the file.</li>
 * </ul>
 *
 * <h3>Input</h3>
 * <p>The first line contains an integer N, the number of lines in the file.
 * The following N lines contain the configuration in order.</p>
 *
 * <h3>Output</h3>
 * <p>Print {@code true} if the configuration is valid, or {@code false}
 * otherwise.</p>
 *
 * <h3>Examples</h3>
 * <pre>
 * Input:
 * 8
 * BEGIN config
 * BEGIN server
 * host=localhost
 * END server
 * BEGIN DATA
 * raw payload
 * END DATA
 * END config
 *
 * Expected output:
 * true
 * </pre>
 * <pre>
 * Input:
 * 6
 * BEGIN config
 * BEGIN DATA
 * BEGIN server
 * END server
 * END DATA
 * END config
 *
 * Expected output:
 * false
 * </pre>
 *
 * <h3>Explanation</h3>
 * <p>In the first example, all blocks are properly nested and DATA contains
 * only regular content. In the second, BEGIN server appears inside an open
 * DATA block, making the configuration invalid. Another invalid case is
 * END a when the most recently opened block is b.</p>
 *
 * <h3>Supporting Code</h3>
 * <p>The shared {@link LinkedStack} implementation is available for use.</p>
 * <p>The examples show expected results after implementation. The current
 * scaffold returns false until the validation method is completed.</p>
 */
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
        // TODO: Implement this method; false is a placeholder return value.
        return false;
    }
}
