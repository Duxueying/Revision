package src.NiuKe;

public class OneNum {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,6,6};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
