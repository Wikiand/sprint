package sprint;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilter {
    public int[][] filterBySum(int[][] array, int minSum) {
        List<int[]> resultList = new ArrayList<>();

        for (int[] subArray : array) {
            int sum = 0;
            for (int num : subArray) {
                sum += num;
            }
            if (sum >= minSum) {
                resultList.add(subArray);
            }
        }

        // Convert List<int[]> back to int[][]
        return resultList.toArray(new int[resultList.size()][]);
    }
}

