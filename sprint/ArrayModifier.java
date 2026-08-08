package sprint;

import java.util.ArrayList;

public class ArrayModifier {
    public static ArrayList<Double> removeElementsBetween(ArrayList<Double> list, int index1, int index2) {
        // Handle empty list
        if (list == null || list.isEmpty()) {
            return list;
        }

        // Swap if index1 > index2
        if (index1 > index2) {
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }

        // Adjust bounds
        if (index1 < 0) index1 = 0;
        if (index2 < 0) index2 = 0;
        if (index1 > list.size()) index1 = list.size();
        if (index2 > list.size()) index2 = list.size();

        // Remove elements between index1 (inclusive) and index2 (exclusive)
        if (index1 < index2) {
            list.subList(index1, index2).clear();
        }

        return list;
    }
}
