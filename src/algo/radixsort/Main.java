package algo.radixsort;

public class Main {
    public static void main(String[] args){
        int[] a = {121, 432, 564, 23, 1, 45, 788};
        radixSort(a);
        printArray(a);
    }
    public static void radixSort(int[] a){
        int max = getMax(a);
        for (int place = 1; max / place > 0; place*=10) {
            countingSingleSort(a,place);
        }
    }
    public static int getMax(int[] a){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maxValue)
                maxValue = a[i];
        }
        return maxValue;
    }
    public static void countingSingleSort(int[] a,int position){
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue)
                maxValue = a[i];
            if(a[i] < minValue)
                minValue = a[i];
        }

        int[] counter = new int[maxValue+1];

        for (int i = 0; i < a.length; i++) {
            counter[(a[i] / position) % 10]++;
        }

        for (int i = 1; i <= maxValue; i++) {
            counter[i] += counter[i-1];
        }
        int[] output = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            output[counter[(a[i] / position) % 10] - 1] = a[i];
            counter[(a[i] /position) % 10]--;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = output[i];
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
