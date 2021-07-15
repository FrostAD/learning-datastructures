package algo.mergesort;

public class Main {
    public static void main(String[] args) {
        int[] a = {99, 5, 11, 75, 22, 4, 17, 77, 23, 99, 10};

        mergeSort(a,0,a.length-1);
        printArray(a);
    }

    public static void mergeSort(int[] A, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(A, start, middle);
            mergeSort(A, middle + 1, end);
            merge(A, start, middle, end);
        }
    }

    public static void merge(int[] A, int start, int middle, int end) {
        int k = start;
        int j = middle + 1;
        int cnt = 0;
        int[] newA = new int[end - start + 1];
        while (k <= middle && j <= end) {
            if (A[k] <= A[j]) {
                newA[cnt] = A[k];
                k++;
            } else {
                newA[cnt] = A[j];
                j++;
            }
            cnt++;
        }
        while (j <= end) {
            newA[cnt] = A[j];
            j++;
            cnt++;
        }
        while (k <= middle) {
            newA[cnt] = A[k];
            k++;
            cnt++;
        }

        for (int i = start; i <= end; i++) {
            A[i] = newA[i - start];
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
