
public class recursiveN {
	public static long calculateFactorial(int n) {
    	//System.out.println("recursive n :  "+n);
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        }
        return n * calculateFactorial(n - 1); // Recursive call
	}
	public static void main(String[] args) {
		
		for (int i=5; i<10;i++) {
			System.out.println(i+" factorial " +calculateFactorial(i));
		
	}
	}
}
