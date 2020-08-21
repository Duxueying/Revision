package src.NiuKe.HuaWei;
//统计字符个数，比如abc,输出3；
import java.util.*;
public class HJ10 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String s = input.nextLine();
        int[] a = new int[128];
        int count=0;
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(a[b]==0){
                count++;
                a[b]=1;
            }
        }
        System.out.println(count);
    }
}
