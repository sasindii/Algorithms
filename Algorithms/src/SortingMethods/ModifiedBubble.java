package SortingMethods;

public class ModifiedBubble {

	public static void main(String[] args) {
		int [] arr= {2,1,13,6,12};
		int n= arr.length;
		boolean swapped;
		 for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (!swapped)
	                break;
	        }
	       
	        System.out.println("Sorted array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i]);
	            if (i < n - 1) {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();

	}

}
