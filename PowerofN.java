
public class PowerofN {
    public static int power(int base, int exponent) {
        // Base case: any number to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        } else {
        	System.out.println("base: "+base+"exponent "+exponent);
            return base * power(base, exponent - 1);  // Recursive case
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));
    }
}