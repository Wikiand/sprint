package sprint;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    public static List<Integer> findPrimesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();
        if (limit < 2) {
            return primes; // no primes below 2
        }

        boolean[] isComposite = new boolean[limit + 1]; // false means prime candidate

        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                // mark multiples of i as composite
                for (int j = i * 2; j <= limit; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return primes;
    }
}
