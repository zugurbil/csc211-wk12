
public class RecursiveDemo1 {
    public static void main(String[] args) {
        System.out.println("The sum is "+
        		printMessage(5)); // Start the recursion with 5 times
    }

    public static int printMessage(int n) {
        // Base case: Stop when times reaches 0
        if (n == 0 | n== 1) {
            return 1;
        }
        // Print the message
        System.out.println("this is a recursive method"+n);
        // Recursive call, decreasing the counter
        return n+printMessage(n - 1);
    }
}
