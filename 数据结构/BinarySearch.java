package KeDaXunFei;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 1;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(get(arr, key, low, high));
    }

    public static int get(int[] arr,int key,int low,int high) {
        int mid=(low+high)/2;
        if(low>high){
            return -1;
        }
        if(key==arr[mid]){
            return mid;
        }
        else if(key>arr[mid]){
            return get(arr,key,mid+1,high);
        }
        else{
            return get(arr,key,low,mid-1);
        }
    }
}
