package algo.selectionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] a = {99,5,11,75,22,4,17,77,23,99,10};
        int[] c = {99,5,11,75,22,4,99};
        int[] b = selectionSort(a);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
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
}
