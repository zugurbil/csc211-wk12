
public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {8, 2, 4, 6, 10, 12, 14, 16, 18, 20}; // Must be sorted
        int target = 18; // Element to search for

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Iterative binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0; // Start of the search range
        int right = array.length - 1; // End of the search range
        System.out.println("l and r " +left+" "+right); 
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Check if the middle element is the target
            if (array[mid] == target) {
                return mid; // Target found
            }

            // Adjust the search range based on comparison
            if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
            System.out.println("l and r " +left+" "+right); 
        }

        // Target not found
        return -1;
    }
}
