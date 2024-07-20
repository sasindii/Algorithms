package SortingMethods;

public class QuickSort {
     // Main function to sort an array using quicksort
        public void quickSort(int[] A, int low, int high) {
            if (low < high) {
                // Partition the array and get the pivot index
                int pi = partition(A, low, high);
    
                // Recursively sort elements before and after partition
                quickSort(A, low, pi - 1);
                quickSort(A, pi + 1, high);
            }
        }
    
        // Partition function
        public int partition(int[] A, int low, int high) {
            int pivot = A[high]; // Pivot element (rightmost)
            int i = low - 1; // Index of smaller element
            for (int j = low; j <= high - 1; j++) {
                // If current element is less than or equal to pivot
                if (A[j] <= pivot) {
                    i++; // Increment index of smaller element
                    swap(A, i, j); // Swap A[i] with A[j]
                }
            }
            swap(A, i + 1, high); // Swap A[i+1] with pivot (A[high])
            return i + 1; // Return the partitioning index
        }
    
        // Function to swap two elements in the array
        public void swap(int[] A, int i, int j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    
        // Utility function to print the array
        public void printArray(int[] A) {
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
    
        // Main method to test the quicksort algorithm
        public static void main(String[] args) {
            QuickSort qs = new QuickSort();
            int[] A = {10, 7, 8, 9, 1, 5};
            int n = A.length;
            System.out.println("Unsorted array:");
            qs.printArray(A);
            qs.quickSort(A, 0, n - 1);
            System.out.println("Sorted array:");
            qs.printArray(A);
        }
    }
    

