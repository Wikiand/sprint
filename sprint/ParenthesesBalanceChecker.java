package sprint;

public class ParenthesesBalanceChecker {

    public boolean isBalanced(String str) {
        // Null input should return false
        if (str == null) {
            return false;
        }
        // Start recursive check with balance = 0
        return checkBalance(str, 0, 0);
    }

    private boolean checkBalance(String str, int index, int balance) {
        // If balance goes negative, order is wrong (e.g. ")(")
        if (balance < 0) {
            return false;
        }
        // Base case: reached end of string
        if (index == str.length()) {
            return balance == 0;
        }

        char current = str.charAt(index);

        // If opening parenthesis, increase balance
        if (current == '(') {
            return checkBalance(str, index + 1, balance + 1);
        }
        // If closing parenthesis, decrease balance
        else if (current == ')') {
            return checkBalance(str, index + 1, balance - 1);
        }
        // Ignore non-parenthesis characters
        else {
            return checkBalance(str, index + 1, balance);
        }
    }
}
