package sprint;

public class RecursivePalindrome {

    public boolean isPalindrome(String str) {
        // Handle null input
        if (str == null) {
            return false;
        }
        // Normalize string: remove non-alphanumeric and trim spaces
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase().trim();

        // Base cases: empty string or single character
        if (cleaned.length() == 0 || cleaned.length() == 1) {
            return true;
        }

        // Call recursive helper
        return isPalindromeHelper(cleaned, 0, cleaned.length() - 1);
    }

    private boolean isPalindromeHelper(String str, int start, int end) {
        // Base case: crossed over
        if (start >= end) {
            return true;
        }
        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive case: move inward
        return isPalindromeHelper(str, start + 1, end - 1);
    }
}
