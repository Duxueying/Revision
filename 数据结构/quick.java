package SortReview;
/*找一个基准值，比基准值小的放到左边，大的放到右边，采用分治思想
对左右两个小区间按同样的方式处理，直到小区间长度为1（已有序）或为0（没有数据）
时间复杂度 nlogn 不稳定*/
public class quick {
    public static void quickSort(int[] arr,int low,int high) {
        int i=low, j=high, t;
        int key= arr[low];
        while (i < j) {
            while (key <= arr[j] && i < j) {
                j--;
            }
            while (key>= arr[i] && i < j) {
                i++;
            }
            if(i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low]=arr[i];
        arr[i]=key;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,4,7,6,13,19,12};
        quickSort(arr,0,arr.length-1);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
