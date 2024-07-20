package SortingMethods;

public class MergeSort {
    private int[] array;
    private int[] tempArray;
    
    public static void main(String[] args) {
        int[] array = {65, 35, 12, 24, 11};
        MergeSort ms = new MergeSort();
        ms.sort(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
    public void sort(int[] inputArray) {
        this.array = inputArray;
        this.tempArray = new int[inputArray.length];
        mergeSort(0, inputArray.length - 1);
    }
    
    private void mergeSort(int lowerIndex, int upperIndex) {
        if (lowerIndex < upperIndex) {
            int mid = lowerIndex + (upperIndex - lowerIndex) / 2;
            mergeSort(lowerIndex, mid);
            mergeSort(mid + 1, upperIndex);
            mergeParts(lowerIndex, mid, upperIndex);
        }
    }
    
    private void mergeParts(int lowerIndex, int mid, int upperIndex) {
        for (int i = lowerIndex; i <= upperIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = mid + 1;
        int k = lowerIndex;
        
        while (i <= mid && j <= upperIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}

