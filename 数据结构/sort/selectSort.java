package src.NiuKe.sort;
//每次选出最小值 平均最坏都是n^2,不稳定
public class selectSort {
    public static void main(String[] args) {
        int[] arr={14,6,3,8,9,1,2,3,7};
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
