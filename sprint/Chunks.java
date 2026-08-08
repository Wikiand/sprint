package sprint;

public class Chunks {

    public static int search(int[] sortedArray, int target) {
        // Edge case: null or empty array
        if (sortedArray == null || sortedArray.length == 0) {
            return 0;
        }
        // Start recursive search
        return searchHelper(sortedArray, target, 0, sortedArray.length - 1, 0);
    }

    private static int searchHelper(int[] arr, int target, int left, int right, int steps) {
        // Base case: out of bounds
        if (left > right) {
            return steps; // do NOT add an extra step here
        }

        // Middle calculation: for even length, use half - 1
        int mid = left + (right - left) / 2;

        // Count this step
        steps++;

        if (arr[mid] == target) {
            return steps;
        } else if (target < arr[mid]) {
            return searchHelper(arr, target, left, mid - 1, steps);
        } else {
            return searchHelper(arr, target, mid + 1, right, steps);
        }
    }
}
