package sprint;

public class GCDRecursive {

    public int gcd(int a, int b) {
        // If both numbers are zero, return 0
        if (a == 0 && b == 0) {
            return 0;
        }
        // If one number is zero, return the absolute value of the other
        if (b == 0) {
            return Math.abs(a);
        }
        if (a == 0) {
            return Math.abs(b);
        }
        // Recursive case using Euclidean algorithm
        return gcd(b, a % b);
    }

}

