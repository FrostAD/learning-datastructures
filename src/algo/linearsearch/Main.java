package algo.linearsearch;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(recursiveLinearSearch(arr,5,0));
    }

    public static int linearSearch(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int recursiveLinearSearch(int[] arr,int key, int i){
        if(i < arr.length){
            if(arr[i] == key)
                return i;

            return recursiveLinearSearch(arr,key,++i);
        }else{
            return -1;
        }
    }
}
