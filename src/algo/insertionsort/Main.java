package algo.insertionsort;

public class Main {
    public static void main(String[] args) {
        int[] a = {99, 5, 11, 75, 22, 4, 17, 77, 23, 99, 10};
        int[] b = {2, 4, 3, 1};
        int[] c = insertionSort(a);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
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
}
