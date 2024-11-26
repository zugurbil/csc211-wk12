
public class RecBinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Must be sorted
        int target = 10; // Element to search for

        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Recursive binary search method
    public static int binarySearch(int[] array, int left, int right, int target) {
        // Base case: If the range is invalid, the element is not in the array
        if (left > right) {
            return -1;
        }

        // Calculate the middle index
        int mid = left + (right - left) / 2;

        // Check if the middle element is the target
        if (array[mid] == target) {
            return mid;
        }

        // Recursive case: Search the left or right half
        if (array[mid] > target) {
            // Target is in the left half
            return binarySearch(array, left, mid - 1, target);
        } else {
            // Target is in the right half
            return binarySearch(array, mid + 1, right, target);
        }
    }
}
