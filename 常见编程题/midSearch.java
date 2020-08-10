package src.NiuKe;

public class midSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int len=arr.length;
        System.out.println(get2(arr,7,0,arr.length-1));


    }
    public  static int get(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            mid=(right+left)/2;
            if(left<right&&arr[mid]>key){
                right=mid-1;
            }
            else if(left<right&&arr[mid]<key){
                left=left+1;
            } else if(arr[mid]==key){
                return arr[mid];
        }
        }
       return -1;
    }
    public static int get2(int[] arr,int key,int low,int high){//递归版本的二分查找
        int mid=(low+high)/2;
        if(arr[mid]>key){
            return get2(arr,key,low,mid-1);
        }else if(arr[mid]<key){
            return get2(arr,key,mid+1,high);
        }
        else{
            return arr[mid];
        }
    }
}
