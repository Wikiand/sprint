package sprint;

public class Fibonacci {

    public int calculateFibonacci(int n) {
        // Handle negative input
        if (n < 0) {
            return -1;
        }
        // Base cases: F(0) = 0, F(1) = 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

}
