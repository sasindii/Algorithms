package SortingMethods;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {9, 1, 4, 2, 11};
        int n = 5 ; // Storing the length of the array

        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array in Ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    

	}

}
