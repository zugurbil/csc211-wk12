
public class ReverseString {

    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        } else {
        	System.out.println(str.substring(1));
            return reverse(str.substring(1)) + str.charAt(0);  // Recursive case
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed string: " + reverse(str));
    }
}