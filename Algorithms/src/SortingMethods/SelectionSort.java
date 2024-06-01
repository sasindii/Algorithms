package SortingMethods;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {9, 1, 4, 2, 11};
        
        // Selection sort algorithm for ascending order
        for (int i = 0; i < 5 - 1; i++) {
            int min = i;
            for (int j = i + 1; j < 5; j++) {
                if (arr[j] < arr[min]) {
                    min= j;
                }
            }
            // Swap arr[i] with the smallest element found
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
        // Print sorted array
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(arr[i]);
            if (i < 5 - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

	}

}
