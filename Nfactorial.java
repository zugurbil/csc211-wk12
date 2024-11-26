

import javax.swing.*;

public class Nfactorial {
	
	 // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
    	System.out.println("recursive n :  "+n);
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }
	
    public static void main(String[] args) {
        // Create and display an input dialog to get the value of n
        String input = JOptionPane.showInputDialog(null, "Enter a non-negative integer:", "Factorial Calculator", JOptionPane.QUESTION_MESSAGE);

        try {
            // Parse the input as an integer
            int number = Integer.parseInt(input);

            // Validate input
            if (number < 0) {
                JOptionPane.showMessageDialog(null, "Please enter a non-negative integer.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calculate factorial using recursion
            long result = calculateFactorial(number);

            // Display the result
            JOptionPane.showMessageDialog(null, "The factorial of " + number + " is: " + result, "Result", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
}
