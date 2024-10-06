import java.util.regex.*;

public class StringProcessor {

    // Method to check if the password is strong
    public boolean isStrongPassword(String password) {
        // Regular expression to check at least one uppercase, one lowercase, one digit, and one special character
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    // Method to count the number of digits in the sentence
    public int calculateDigits(String sentence) {
        int count = 0;
        for (char ch : sentence.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    // Method to calculate the number of words in the sentence
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Method to evaluate a mathematical expression
    public double calculateExpression(String expression) {
        try {
            return evaluateExpression(expression);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    // Helper method to evaluate a mathematical expression
    private double evaluateExpression(String expression) {
        // Use JavaScript engine to evaluate the expression
        try {
            javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
            javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
            return (double) engine.eval(expression);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error evaluating expression");
        }
    }
}
