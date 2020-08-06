package src.NiuKe.sort;
//时间n^2;空间1;稳定
//思想：一直取新的元素往有序队列里面插
public class insertSort {
    public static void main(String[] args) {
        int[] arr={2,4,3,9,6,27,6,8,9,1};
        for(int i=1;i<arr.length;i++){
            // 有序   [0, i)
            // 无序   [i, array.length)
            int key=arr[i];
            int j;
            for(j=i-1;j>=0&&arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
