public class MainApp {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();

        // Test cases for isStrongPassword
        System.out.println("Testing isStrongPassword:");
        System.out.println(sp.isStrongPassword("A1@bcdef"));  // true (valid strong password)
        System.out.println(sp.isStrongPassword("abc123"));    // false (no uppercase, special character)
        System.out.println(sp.isStrongPassword("Abcdefg!"));  // false (no digit)
        System.out.println(sp.isStrongPassword("A1@b"));      // false (too short)
        System.out.println(sp.isStrongPassword("Abc1234@"));  // true (valid strong password)

        // Test cases for calculateDigits
        System.out.println("\nTesting calculateDigits:");
        System.out.println(sp.calculateDigits("I have 1234 digits"));  // 4 (four digits)
        System.out.println(sp.calculateDigits("No digits here!"));     // 0 (no digits)
        System.out.println(sp.calculateDigits("1234567890"));          // 10 (all digits)
        System.out.println(sp.calculateDigits("One1Two2Three3"));      // 3 (three digits)
        System.out.println(sp.calculateDigits("The year is 2024."));   // 4 (four digits)

        // Test cases for calculateWords
        System.out.println("\nTesting calculateWords:");
        System.out.println(sp.calculateWords("This is a sentence."));           // 4 (four words)
        System.out.println(sp.calculateWords("    Leading spaces here."));      // 3 (three words)
        System.out.println(sp.calculateWords("Trailing spaces here.    "));     // 3 (three words)
        System.out.println(sp.calculateWords("   "));                           // 0 (no words)
        System.out.println(sp.calculateWords("SingleWord"));                    // 1 (one word)

        // Test cases for calculateExpression
        System.out.println("\nTesting calculateExpression:");
        System.out.println(sp.calculateExpression("(2 + 3) * 5 - 8 / 4"));      // 23.0 (valid expression)
        System.out.println(sp.calculateExpression("10 / 2 + 3 * 4"));           // 22.0 (valid expression)
        System.out.println(sp.calculateExpression("100 - (5 * 4) / 2"));        // 90.0 (valid expression)
        System.out.println(sp.calculateExpression("1 + 2 * 3 - 4 / 2"));        // 5.0 (valid expression)
        try {
            System.out.println(sp.calculateExpression("invalid expression"));   // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());                                 // "Invalid expression"
        }
    }
}
