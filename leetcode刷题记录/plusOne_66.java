package LeetCode;

public class plusOne_66 {
    public int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        //都等于九，加完后就是第一个为1，其余都为0
        int[] newDigits=new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}
