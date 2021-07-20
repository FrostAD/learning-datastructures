package algo.quicksort;

public class Main {
    public static void main(String[] args) {
        int[] a = {20, 35, -15, 7, 55, 1, -22};


        quickSort2(a, 0, a.length - 1);
        printArray(a);
    }

    public static void quickSort(int[] A, int start, int end) {
        if (start < end) {
            int q = partition(A, start, end);

            quickSort(A, start, q - 1);
            quickSort(A, q + 1, end);
        }
    }

    public static int partition(int[] A, int start, int end) {
        int j = start - 1;
        int pivot = A[end];
        for (int i = start; i <= end - 1; i++) {
            if (A[i] <= pivot) {
                j++;
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
            }
        }
        int tmp = A[j + 1];//j is the last smaller value => we set the pivot to j + 1
        A[j + 1] = A[end];
        A[end] = tmp;
        return j + 1;
    }

    public static void quickSort2(int[] a, int start, int end) {
        if (start < end) {
            int pivotIndex = partition2(a, start, end);

            quickSort2(a, start, pivotIndex-1);
            quickSort2(a, pivotIndex + 1, end);
        }
    }

    public static int partition2(int[] a, int start, int end) {
        int pivot = a[end];
        int i = start-1;

        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                i++;
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        int tmp = a[i+1];
        a[i+1] = a[end];
        a[end] = tmp;

        return i+1;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
