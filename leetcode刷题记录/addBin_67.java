package LeetCode;

public class addBin_67 {
    public String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        //依次加两个数组低位的值
        while(i>=0&&j>=0){
            int sum=carry;
            sum=sum+a.charAt(i--)-'0';//把字符变成数字
            sum=sum+b.charAt(j--)-'0';
            carry=sum/2;
            sb.append(sum%2);
        }
        //这是处理a数组比b数组长的情况
        while(i>=0){
            int sum=carry+a.charAt(i--)-'0';
            carry=sum/2;
            sb.append(sum%2);
        }
        //这是处理b数组比a数组长的情况
        while(j>=0){
            int sum=carry+b.charAt(j--)-'0';
            carry=sum/2;
            sb.append(sum%2);
        }
        if(carry==1){//如果进位为1，说明最后还有一个进位需要处理
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
