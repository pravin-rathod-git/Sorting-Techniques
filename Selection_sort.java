public class Selection_sort {

    // 🧮 Function to perform Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // Outer loop moves boundary of unsorted part
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first unsorted element is smallest

            // Inner loop finds the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update index of smallest element
                }
            }

            // Swap the found smallest element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // 🧩 Main function to test Selection Sort
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2}; // Input array

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call selection sort function
        selectionSort(arr);

        System.out.println("\n\nSorted Array (Ascending Order):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
