package src.niuKe;

public class FrontJiBackOu {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,9,10,3,7};
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1) {//为奇数
                int temp = arr[i];//先把它保存下来
                int j = i;
                while (j>k) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[k] = temp;
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
/*public class Solution {
    public void reOrderArray(int [] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}*/
