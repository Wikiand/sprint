package sprint;

import java.util.*;

public class Transformer {

    public static int[] transform(int[] arr) {
        // Step 1: Remove duplicates
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        List<Integer> list = new ArrayList<>(uniqueSet);

        // Step 2: Sort in descending order
        list.sort(Collections.reverseOrder());

        // Step 3: Replace every third element
        for (int i = 2; i < list.size(); i += 3) {
            int sum = list.get(i - 1) + list.get(i - 2);
            list.set(i, sum);
        }

        // Step 4: Reverse the array
        Collections.reverse(list);

        // Convert back to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

