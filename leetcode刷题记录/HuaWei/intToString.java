package src.NiuKe.HuaWei;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        /*将整数转化为string并逆序输出
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        String str=String.valueOf(num);
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        System.out.println(str);
    }*/
        //将字符串逆序输出
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
