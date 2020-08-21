package src.NiuKe.HuaWei;

import java.util.Scanner;

public class suan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char[] arr=str.toCharArray();
        if(arr[3]=='+'){
            System.out.println(add(str));
        }
        if(arr[3]=='-'){
            System.out.println(add(str));
        }
        if(arr[3]=='*'){
            System.out.println(cheng(str));
        }
        if(arr[3]=='/'){
            System.out.println(dev(str));
        }
    }
    public static String add(String str){
        if(str.charAt(2)==str.charAt(6)){
            int num1 = Integer.valueOf(str.charAt(0)) + Integer.valueOf(str.charAt(4));
            String s = String.valueOf(num1) + "/" + str.charAt(6);
            return s;
        }
        else{
            int num=Integer.valueOf(str.charAt(2)) * Integer.valueOf(str.charAt(6));
            int sum=Integer.valueOf(str.charAt(0))*Integer.valueOf(str.charAt(6))+
                    Integer.valueOf(str.charAt(4))*Integer.valueOf(str.charAt(2));
            String s=String.valueOf(sum)+"/"+String.valueOf(num);
            return s;
        }
    }
    public static String jian(String str){
        if(str.charAt(2)==str.charAt(6)){
            int num1 = Integer.valueOf(str.charAt(0)) + Integer.valueOf(str.charAt(4));
            String s = String.valueOf(num1) + "/" + str.charAt(6);
            return s;
        }
        else{
            int num=Integer.valueOf(str.charAt(2)) * Integer.valueOf(str.charAt(6));
            int sum=Integer.valueOf(str.charAt(0))*Integer.valueOf(str.charAt(6))-
                    Integer.valueOf(str.charAt(4))*Integer.valueOf(str.charAt(2));
            String s=String.valueOf(sum)+"/"+String.valueOf(num);
            return s;
        }
    }
    public static String cheng(String str) {
        if (str.charAt(2) != 0 && str.charAt(6) != 0) {
            int num1 = Integer.valueOf(str.charAt(0)) * Integer.valueOf(str.charAt(4));
            int num2 = Integer.valueOf(str.charAt(2)) * Integer.valueOf(str.charAt(6));
            String s = String.valueOf(num1) + "/" + String.valueOf(num1);
            return s;
        }
        return null;
    }
    public static String dev(String str){
        if (str.charAt(2) != 0 && str.charAt(6) != 0) {
            int num1 = Integer.valueOf(str.charAt(0)) * Integer.valueOf(str.charAt(6));
            int num2 = Integer.valueOf(str.charAt(2)) * Integer.valueOf(str.charAt(4));
            String s = String.valueOf(num1) + "/" + String.valueOf(num1);
            return s;
        }
        return null;
    }
}
