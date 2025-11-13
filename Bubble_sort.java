public class Bubble_Sort {

    // 🧮 Function to perform Bubble Sort
    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swap flag for each pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Compare current element with next
                if (arr[j] > arr[j + 1]) {
                    // Swap if elements are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Mark that a swap happened
                }
            }

            // 🚀 If no swaps occurred, array is already sorted — stop early
            if (!swapped)
                break;
        }
        return arr;
    }

    // 🧩 Main function to test Bubble Sort
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2}; // Input array

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call bubble sort function
        bubbleSort(arr);

        System.out.println("\n\nSorted Array (Ascending Order):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
