package algo.shellsort;

public class Main {
    public static void main(String[] args){
        int[] a = {20,35,-15,7,55,1,-22};

        shellSort(a);
        printArray(a);
    }
    public static void shellSort(int[] arr){
        for (int gap = arr.length/2; gap > 0 ; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                int element = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > element){
                    arr[j] = arr[j - gap];
                    j-=gap;
                }
                arr[j] = element;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
