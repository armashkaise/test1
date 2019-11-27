package Zadanie;

public class ArrClass {
    public static void main(String[] args) {

        int[] arrInt = {6, 3, 2, 5, 1, 4};

        int[] arrBubbleSortInt = bubbleSort(arrInt);
        System.out.println("Bubble sort - int");
        printArr(arrBubbleSortInt);

        long[] arrLong = {1L, 13L, 4L, 10L, 6L, 8L };
        long[] arrBubbleSortLong = bubbleSort(arrLong);
        System.out.println("Bubble sort - long");
        printArr(arrBubbleSortLong);

        int[] arr1 = {2, 6, 4, 3, 1};
        int[] arrQuickSort = quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Quick sort");
        printArr(arrQuickSort);
    }

    static int[] bubbleSort(int [] arr){
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++){
            for (int j = 0; j < arrLength-i; j++){
                if (arr[i] > arr[j+i]){
                    int val = arr[i];
                    arr[i] = arr[j+i];
                    arr[j+i] = val;
                }
            }
        }
        return arr;
    }

    static long[] bubbleSort(long [] arr){
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++){
            for (int j = 0; j < arrLength-i; j++){
                if (arr[i] > arr[j+i]){
                    long val = arr[i];
                    arr[i] = arr[j+i];
                    arr[j+i] = val;
                }
            }
        }
        return arr;
    }



        static int[] quickSort(int[] array, int low, int high) {

            int middle = low + (high - low) / 2;
            int opora = array[middle];

            int i = low, j = high;
            while (i <= j) {
                while (array[i] < opora) {
                    i++;
                }

                while (array[j] > opora) {
                    j--;
                }

                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);

            return array;
        }

    static void printArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }

    static void printArr(long[] arr){
        for (long i : arr){
            System.out.println(i);
        }
    }
}
