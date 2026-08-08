package sprint;

public class StringConcatenator {
    // Method that accepts variable number of String arguments
    public String concatenate(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}
