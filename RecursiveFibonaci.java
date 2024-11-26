
public class RecursiveFibonaci {
/************************************************************
 * The series starts with 0 and 1. Each subsequent number is the sum of the previous two.
 * Formula:  F(n)=F(n-1)+F(n-2)
 *     where F(0)=0  F(1)=1
 * For n>1 the function calculates the sum of the two preceding numbers,
 * 		fibonacci(n - 1) and fibonacci(n - 2)
 * 
 * Example : 
 * The first 10 terms of the Fibonacci series are:
 *         0 1 1 2 3 5 8 13 21 34
 *  
 ************************************************************/
	public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        System.out.println("The first " + n + " terms of the Fibonacci series are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of the two preceding Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
