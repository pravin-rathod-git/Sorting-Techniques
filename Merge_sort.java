public class Merge_sort {

    // 🧩 Function to merge two halves
    public static void merge(int arr[], int left, int mid, int right) {
        // Find sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into arr[]
        int i = 0, j = 0;
        int k = left; // Initial index of merged subarray

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // 🔁 Recursive function for Merge Sort
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            // Find middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // 🧠 Main function to test Merge Sort
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Call merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Array (Ascending Order):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
