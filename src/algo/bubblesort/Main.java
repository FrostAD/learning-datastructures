package algo.bubblesort;

public class Main {
    public static void main(String[] args){
        int[] a = {20,35,-15,7,55,1,-22};

        bubbleSort(a);
        printArray(a);
    }
    public static void bubbleSort(int[] arr){
        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
