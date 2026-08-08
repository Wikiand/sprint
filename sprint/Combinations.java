
package sprint;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<String> combN(int n) {
        List<String> result = new ArrayList<>();

        if (n <= 0) {
            return result; // return empty list if n <= 0
        }

        generateCombinations("", 0, n, result);
        return result;
    }

    private void generateCombinations(String prefix, int start, int n, List<String> result) {
        if (prefix.length() == n) {
            result.add(prefix);
            return;
        }

        for (int i = start; i <= 9; i++) {
            generateCombinations(prefix + i, i + 1, n, result);
        }
    }
}
