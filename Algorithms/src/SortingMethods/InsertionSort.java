package SortingMethods;

public class InsertionSort {

	public static void main(String[] args) {
int[] arr = {9, 1, 4, 2, 11};
        
        // Insertion sort algorithm
        for (int i = 1; i <5; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        // Print sorted array
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i <5; i++) {
            System.out.print(arr[i]);
            if (i < 5 - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();


	}

}
