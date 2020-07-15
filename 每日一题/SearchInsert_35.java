package LeetCode;

public class SearchInsert_35 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            //比目标值大或者等于都是直接返回下标；
            if(nums[i]>=target){
                return i;
            }
        }
        //数组中的元素都比目标值小的时候，就说明插在最后，也就是返回数组的长度
        return nums.length;
    }
}
