package algo.quicksort;

public class Main {
    public static void main(String[] args) {
        int[] a = {99, 5, 11, 75, 22, 4, 17, 77, 23, 99, 10};

        quickSort(a, 0, a.length - 1);
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
        int tmp = A[j + 1];
        A[j + 1] = A[end];
        A[end] = tmp;
        return j + 1;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
