package src.niuKe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class moreThanHalf {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,2,4,5,4,6,4,5,4,4,4,4};
        System.out.println(solution(arr));
    }

    public static int solution1(int[] arr){
        //利用map的key value模型来存放arr[i]和相对应出现的次数
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);//已经存在就给value加1
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>arr.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
    public static int solution2(int[] arr){
        //先对数组排序，如果这个数存在，那它一定在arr[mid]的位置，
        Arrays.sort(arr);
        int count=0;
        int mid=arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[mid]){
                count++;
            }
        }
        if(count>mid){//出现的次数超过mid，则返回它；
            return arr[mid];
        }
        return 0;
    }
    public static int solution3(int[] arr){
        //抵消法：将target和其他元素进行抵消，由于target出现的次数大于别的元素，所以最后剩下的就是我们要找的
        //1,4,5,7,2,4,5,4,6,4,5,4,4,4,4
        int target=arr[0];//target先设为arr[0];
        int times=1;
        for(int i=0;i<arr.length;i++){
            if(times==0){
                target=arr[i];
                times=1;
            }
            else
            {
                if(arr[i]==target){
                    times++;
                } else {
                    times--;
                }
            }
        }
        return target;
    }
    public static int solution4(int[] arr){
        int low=0;
        int high=arr.length-1;
        int mid=(high-low)/2;
        int index=partition(arr,low,high);
        while(index!=arr.length/2){
            if(index<arr.length/2){
                low=index+1;
                index=partition(arr,low,high);
            }
            else{
                high=index-1;
                index=partition(arr,low,high);
            }
        }
        int num=arr[index];
        int times=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                times++;
            }
        }
        if(times*2>arr.length){
            return num;
        }
        return 0;
    }
    public static int partition(int[] arr,int low,int high){
        int key=arr[low];
        while(low<high){
            while(low<high&&arr[high]>=key){
                high--;
            }
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            while(low<high&&arr[low]<=key){
                low++;
            }
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }
        return low;
    }
    public  static int solution(int[] arr){
        int count=0;
        int aws=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                aws=arr[i];
            }
            if(arr[i]==aws){
                count++;
            } else {
                count--;
            }
        }
        return aws;
    }
}
