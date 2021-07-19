package algo.insertionsort;

public class Main {
    public static void main(String[] args) {
        int[] a = {20,35,-15,7,55,1,-22};

        insertionSort2(a);
        printArray(a);
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int tmp = arr[i];
            while (j >= 0 && tmp < arr[j]) {
                arr[j+1] = arr[j]; //!! j+1
                j--;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    public static void insertionSort2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > element){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
