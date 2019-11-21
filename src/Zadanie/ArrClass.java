package Zadanie;

public class ArrClass {
    public static void main(String[] args) {

        int[] arr = {6, 3, 2, 5, 1, 4};

        int[] arrBubbleSort = bubbleSort(arr);
        System.out.println("Bubble sort");
        printArr(arrBubbleSort);

        //int[] arrQuickSort =
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
      /*       public static void main(String[] args) {
                int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
                System.out.println("Было");
                System.out.println(Arrays.toString(x));

                int low = 0;
                int high = x.length - 1;

                quickSort(x, low, high);
                System.out.println("Стало");
                System.out.println(Arrays.toString(x));
            }


       if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arr[i] <= arr[cur])) {
                i++;
            }
            while (j > cur && (arr[cur] <= arr[j])) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }

        }
        quickSort(arr, start, cur);
        quickSort(arr,cur+1, end);

        //return 0;*/



    static void printArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
}
