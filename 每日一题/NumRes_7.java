package LeetCode;
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。输入: -123
//输出: -321
import java.util.Scanner;

public class NumRes_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int anw=reverse(n);
        System.out.println(anw);
    }
    public static int reverse(int x) {
        long result=0;
        while(x!=0){
            result=result*10+x%10;//
            x=x/10;
        }
        if((int)result!=result){//判断有没有溢出
            return 0;
        }
        else{
            return (int)result;
        }
    }
}
