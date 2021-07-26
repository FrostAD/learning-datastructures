package algo.bucketsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] array= {54,46,83,66,95,92,43};

        bucketSort(array);
        print(array);
    }
    public static void bucketSort(int[] a){
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < a.length; i++) {
            buckets[(a[i] / 10)].add(a[i]);
        }
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                a[index++] = buckets[i].get(j);
            }
        }
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
