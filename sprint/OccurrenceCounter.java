package sprint;

public class OccurrenceCounter {

    public int countOccurrences(int[] arr, int element, int index) {
        // Edge cases
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (index < 0 || index >= arr.length) {
            return 0;
        }

        // Check current element
        int count = (arr[index] == element) ? 1 : 0;

        // Recursive case: move to next index
        return count + countOccurrences(arr, element, index + 1);
    }
}

