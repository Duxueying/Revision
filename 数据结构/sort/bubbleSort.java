package src.NiuKe.sort;
//时间复杂度平均n^2，最好有序时n;空间复杂度1 ;是稳定排序
// 思想：两两比较大的放后面，每次得出最大值放最后，
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={1,4,7,9,2,4,6,9};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
