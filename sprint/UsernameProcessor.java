package sprint;

import java.util.List;

public class UsernameProcessor {
    public String findFirstUsername(List<String> usernames) {
        return usernames.stream()
                        .findFirst()
                        .orElse("Anonymous");
    }
}

