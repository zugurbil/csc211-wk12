 

public class RecArraySum {
	
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};          // Example array
        
        int sum = findSum(array, array.length - 1); // Start recursion with the last index
        
        System.out.println("The sum of the array elements is: " + sum);
    }

    // Recursive method to find the sum of elements in the array
    public static int findSum(int[] array, int index) {
        // Base case: if the index is less than 0, stop recursion
    	
        if (index < 0) {
            return 0;
        }
        System.out.println("findsum index and  "+index+" array element "+array[index]);
        // Recursive call: sum the current element with the sum of remaining elements
        return array[index] + findSum(array, index - 1);
    }
}
