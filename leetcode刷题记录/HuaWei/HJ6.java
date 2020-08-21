package src.NiuKe.HuaWei;
//输出一个数的质因子，并排序；比如180，输出2 2 3 3 5；
import java.util.*;
public class HJ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        get(num);
    }
    public static void get(int num){
        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" ");
                get(num/i);
                break;
            }
            if(i==num){
                System.out.println(i+" ");
            }
        }
    }
}
