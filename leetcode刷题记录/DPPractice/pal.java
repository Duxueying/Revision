package src.DPPractice;
import java.util.*;
public class pal {
    public class Solution {
        public boolean isPal(String s,int start,int end){
            while(start<end){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
        public int minCut (String s) {
            int len=s.length();
            if(len==0){
                return 0;
            }
            int[] arr=new int[len+1];
            for(int i=0;i<=len;i++){//进行初始化
                arr[i]=i-1;
            }
            for(int i=1;i<=len;i++){
                for(int j=0;j<i;j++){
                    if(isPal(s,j,i-1)){
                        arr[i]=Math.min(arr[i],arr[j]+1);
                    }
                }
            }
            return arr[len];
        }
    }
}
