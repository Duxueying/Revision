package LeetCode;

import java.util.TreeSet;

public class Duplicate_217 {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,3,2};
        System.out.println(get(arr));
    }
    public static boolean get(int[] nums){
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()!=nums.length){
            return true;
        }
        return false;
    }
}
