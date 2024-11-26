

public class RecSumof2Numbers {
    public static void main(String[] args) {
        int a = 5; // First number
        int b = 3; // Second number

        int result = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }

    // Recursive method to add two numbers
    public static int add(int a, int b) {
        // Base case: if b is 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: increment a and decrement b
        System.out.println("a: "+a+" b "+b);
        return add(a + 1, b - 1);
    }
}
