package LeetCode;

public class merge_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) {
            if(m==0||nums1[m-1]<nums2[n-1]){
                nums1[m+n-1]=nums2[--n];//先减在赋值
            }
            else
            {
                nums1[m+n-1]=nums1[--m];
            }
        }
    }
}
