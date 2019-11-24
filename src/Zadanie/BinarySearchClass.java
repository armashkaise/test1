package Zadanie;

public class BinarySearchClass {
    public static void main(String[] args) {
        binarySearch();
    }

    static void binarySearch(){
        System.out.println("Hallo");
        int[] arr = {1, 2, 4, 7, 8, 13, 18, 21, 25};
        printArrInLine(arr);
        int item = 12;
        int low = 0;
        int high = arr.length - 1;
        int mid, position = -1;

        while (low <= high){
            mid = (low + high)/2;
            int guess = arr[mid];
            if (guess == item){
                position = mid;
                break;
            } else if (guess < item){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (position > -1){
            System.out.println("Значение " + item + " находится на позиции " + position);
        } else {
            System.out.println("Значение " + item + " в списке не найдено");
        }
    }

    static void printArrInLine(int[] arr){
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
