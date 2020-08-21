package src.NiuKe.HuaWei;

import java.util.Scanner;
//16进制转十进制
public class HJ5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        //decode方法可以直接进行解码
        System.out.println(Integer.decode(str));
    }
}
