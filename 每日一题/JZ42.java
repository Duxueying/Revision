package day6_26;
import java.util.Collections;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        if(array==null||array.length<2){//数组为空直接返回
            return list;
        }
        int left=0,right=array.length-1;
        while(left<right){//循环条件
            if(array[left]+array[right]==sum){
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
            else if(array[left]+array[right]>sum){
                right--;
            }
            else{
                left++;
            }
        }
        return list;
    }
}