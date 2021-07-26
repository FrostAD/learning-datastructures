package algo.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(binarySearch(arr, 5));
        System.out.println(recursiveBinaryTwo(arr, 0, arr.length, 5));
    }

    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] > x) {
                end = middle - 1;
            } else if (arr[middle] < x) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int x, int start, int end) {
        if (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == x)
                return middle;
            else if (arr[middle] > x)
                return recursiveBinarySearch(arr, x, start, middle - 1);
            else
                return recursiveBinarySearch(arr, x, middle + 1, end);
        } else {
            return -1;
        }
    }


    public static int recursiveBinaryTwo(int[] a,int start,int end,int value){
        if (start < end){
            int middle = (start + end) /2;
            if(a[middle] == value){
                return middle;
            }
            else if(a[middle] > value){
                return recursiveBinaryTwo(a,start,middle,value);
            }else{
                return recursiveBinaryTwo(a,middle + 1,end,value);
            }
        }else {
        return -1;
        }
    }















}
