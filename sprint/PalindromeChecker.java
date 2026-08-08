package sprint;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false; // null is not a palindrome
        }

        // Normalize: remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // Edge case: empty string after normalization is considered a palindrome
        if (normalized.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

