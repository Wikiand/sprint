package sprint;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthAnalyzer {
    public Map<Integer, Integer> analyzeWordLengths(List<String> words) {
        return words.stream()
                    .collect(Collectors.groupingBy(
                        String::length,                 // group by word length
                        Collectors.collectingAndThen(   // count words in each group
                            Collectors.counting(),
                            Long::intValue              // convert count from Long to Integer
                        )
                    ));
    }
}

