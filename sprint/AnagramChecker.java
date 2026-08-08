
package sprint;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false; // null strings are not anagrams
        }

        // Normalize: remove spaces, punctuation, and convert to lowercase
        String normalized1 = str1.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String normalized2 = str2.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // Quick length check
        if (normalized1.length() != normalized2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] chars1 = normalized1.toCharArray();
        char[] chars2 = normalized2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare sorted arrays
        return Arrays.equals(chars1, chars2);
    }
}
