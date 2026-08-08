package sprint;

public class Factorial {

    public int calculateFactorial(int n) {
        // Handle negative input
        if (n < 0) {
            return 0;
        }
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * calculateFactorial(n - 1);
    }

}
