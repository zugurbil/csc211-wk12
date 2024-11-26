

public class RecursiveCharCount {
    
    // Recursive method to count occurrences of a character in a string
    public static int countChar(String str, char ch, int index) {
        // Base case: if the index is equal to the length of the string, stop recursion
        if (index == str.length()) {
            return 0;
        }

        // Check if the current character matches the target character
        int count = (str.charAt(index) == ch) ? 1 : 0;

        // Recurse for the next index
        return count + countChar(str, ch, index + 1);
    }
    
    public static void main(String[] args) {
        String inputString = "hello world";
        char characterToCount = 'l';

        // Start recursion from index 0
        int result = countChar(inputString, characterToCount, 0);

        System.out.println("The character '" + characterToCount + "' appears " + result + " times.");
    }
}