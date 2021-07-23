package algo.radixsort;

import java.util.Arrays;

public class MainString {
    public static void main(String[] args){
        String[] a = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
        radixSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void radixSort(String[] a){
        String max = getMax(a);
        for (int place = 1; max.length() > 0; place++) {
            countingSingleSort(a,place);
            max = max.substring(0,max.length()-1);
        }
    }
    public static String getMax(String[] a){
        String maxValue = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i].length() > maxValue.length())
                maxValue = a[i];
        }
        return maxValue;
    }
    public static void countingSingleSort(String[] a,int position){
        String maxValue = a[0];
        String minValue = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > maxValue.length())
                maxValue = a[i];
            if(a[i].length() < minValue.length())
                minValue = a[i];
        }

        int[] counter = new int[26];

        for (int i = 0; i < a.length; i++) {
            counter[(a[i].charAt(a[i].length() - position)) - 'a']++;
        }

        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i-1];
        }
        String[] output = new String[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            output[counter[a[i].charAt(a[i].length() -position) - 'a'] - 1] = a[i];
            counter[(a[i].charAt(a[i].length() -position)) - 'a']--;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = output[i];
        }
    }
}
