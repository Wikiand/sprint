package sprint;

import java.util.List;
import java.util.stream.Collectors;

public class StringToIntConverter {

    public List<Integer> convertStringListToIntList(List<String> stringList) {
        return stringList.stream()
                .map(Integer::parseInt)   // convert each string to integer
                .collect(Collectors.toList()); // collect into a list
    }
}
