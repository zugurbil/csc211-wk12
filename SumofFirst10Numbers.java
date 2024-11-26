

public class SumofFirst10Numbers {
  
	public static void main(String[] args) {
        int num = 10; // First 10 numbers
        int sum = findSum(num);
        System.out.println("The sum of the first " + num + " numbers is: " + sum);
    }

    // Recursive method to calculate the sum of the first n numbers
    public static int findSum(int n) {
        // Base case: when n reaches 0
        if (n == 1) {
            return 1;
        }
        // Recursive case: add n to the sum of (n-1) numbers
        System.out.println("n is "+n);
        return n * findSum(n - 1);
    }
}
