package sprint;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPolice {
    public List<Integer> processNumbers(List<Integer> numbers) {
        return numbers.stream()
                // filter out negative numbers
                .filter(n -> n >= 0)
                // filter out numbers divisible by 5 but not by 10
                .filter(n -> !(n % 5 == 0 && n % 10 != 0))
                // collect into a new list
                .collect(Collectors.toList());
    }
}
