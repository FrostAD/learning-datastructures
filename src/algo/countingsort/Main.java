package algo.countingsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
     int[] a = { 4,2,2,8,3,3,1};
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

        int[] counter = new int[maxValue+1];

        for (int i = 0; i < a.length; i++) {
            counter[a[i]]++;
        }
        //cumulative(stable version)
        int[] counter2 = new int[maxValue+1];
        for (int i = 0; i < counter.length; i++) {
            counter2[i] = counter[i];
        }
        for (int i = 1; i <= maxValue; i++) {
            counter2[i] += counter[i-1];
        }
        int[] output = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            output[counter2[a[i]] - 1] = a[i];
            counter2[a[i]]--;
        }

        //

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
