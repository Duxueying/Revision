package src.NiuKe.HuaWei;
//任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个
// 素数差值最小的素数对
import java.util.Scanner;
public class HJ60 {
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            while (input.hasNext()) {
                minSushuDui(input.nextInt());
            }
        }
        //找最小素数对
        public static void minSushuDui(int n){
            for(int i=n/2;i<n;i++){
                if(is(i)&&is(n-i)){
                    System.out.println(n-i);
                    System.out.println(i);
                    break;
                }
            }
        }
        //判断是不是素数
        public static boolean is(int num){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
