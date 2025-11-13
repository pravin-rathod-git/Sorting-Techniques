public class Insertion_Sort {

    // 🧮 Function to perform Insertion Sort
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        // Start from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key into its correct position
            arr[j + 1] = key;
        }
    }

    // 🧩 Main function to test Insertion Sort
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2}; // Input array

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call insertion sort function
        insertionSort(arr);

        System.out.println("\n\nSorted Array (Ascending Order):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
