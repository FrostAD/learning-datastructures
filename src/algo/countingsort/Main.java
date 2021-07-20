package algo.countingsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
     int[] a = { 2,7,1,6,3,9,9,1,3,4};
     countingSort(a);
     printArray(a);

    }
    //Note range = 1 to max value
    public static void countingSort(int[] a){
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue)
                maxValue = a[i];
            if(a[i] < minValue)
                minValue = a[i];
        }

        int[] counter = new int[maxValue - minValue + 1];

        for (int i = 0; i < a.length; i++) {
            counter[a[i] - minValue]++;
        }
        int index = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0){
                a[index++] = i + minValue;
                counter[i]--;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
