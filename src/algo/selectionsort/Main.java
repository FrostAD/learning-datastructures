package algo.selectionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] a = {20,35,-15,7,55,1,-22};

        selectionSort2(a);
        printArray(a);
    }

    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }
    public static void selectionSort2(int[] arr){
        for (int unsortedIndex = arr.length - 1; unsortedIndex > 0 ; unsortedIndex--) {
        int largestIndex = 0;
            for (int j = 1; j <= unsortedIndex; j++) {
                if (arr[largestIndex] < arr[j])
                    largestIndex = j;
            }
            int tmp = arr[largestIndex];
            arr[largestIndex] = arr[unsortedIndex];
            arr[unsortedIndex] = tmp;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
