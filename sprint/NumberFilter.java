package sprint;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NumberFilter {
    private final List<Integer> numbers;

    public NumberFilter(int count, long seed) {
        this.numbers = generateRandomNumbers(count, seed);
    }

    private List<Integer> generateRandomNumbers(int count, long seed) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random(seed);
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(2001) - 1000); // range -1000 to 1000
        }
        return list;
    }

    public List<Integer> getAllPrimeNumbers() {
        List<Integer> primes = new ArrayList<>();
        for (int n : numbers) {
            if (isPrime(n)) {
                primes.add(n);
            }
        }
        return primes;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public List<Integer> getDivisibleBy3ButNot5() {
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % 3 == 0 && n % 5 != 0) {
                result.add(n);
            }
        }
        return result;
    }

    public List<Integer> getSortedRemainingNumbers() {
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % 3 != 0 && n % 5 != 0) {
                result.add(n);
            }
        }
        result.sort((a, b) -> b - a); // descending order
        return result;
    }

    public double computeAverageOfRemainingNumbers() {
        List<Integer> remaining = getSortedRemainingNumbers();
        if (remaining.isEmpty()) return 0.0;
        double sum = 0;
        for (int n : remaining) {
            sum += n;
        }
        return sum / remaining.size();
    }
}
