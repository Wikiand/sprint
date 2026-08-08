package sprint;

import java.util.List;
import java.util.stream.Collectors;

public class EmailDomainExtractor {
    public List<String> extractDomains(List<String> emails) {
        return emails.stream()
                     .filter(email -> email != null
                                      && email.contains("@")
                                      && email.indexOf('@') == email.lastIndexOf('@')
                                      && email.indexOf('@') > 0
                                      && email.indexOf('@') < email.length() - 1)
                     .map(email -> email.substring(email.indexOf('@') + 1).toLowerCase())
                     .distinct()
                     .collect(Collectors.toList());
    }
}

