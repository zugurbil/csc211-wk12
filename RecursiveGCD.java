 
public class RecursiveGCD {


    public static void main(String[] args) {
 
  /*
   * The GCD of two numbers a and b (where a > b is the same as the GCD of 
   * b and a%b
   * 
   * Repeat this process until b becomes 0. At that point, a is the GCD.
   * 
   * When b=0 return a as the GCD
   */
    	
    	
    	int num1 = 56; // First number
        int num2 = 98; // Second number

        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Recursive method to calculate GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        // Base case: when b becomes 0
        if (b == 0) {
        	System.out.println("a: " + a+" b: "+b);
            return a;
        }
        System.out.println("a: " + a+" b: "+b);
        // Recursive case: gcd(a, b) = gcd(b, a % b)
        return findGCD(b, a % b);
    }
}
