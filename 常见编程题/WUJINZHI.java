package src;

import java.util.Scanner;
import java.util.Stack;

public class WUJINZHI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        String s=Integer.toString(num);
        StringBuilder sb=new StringBuilder(s).reverse();
        String s3=sb.toString();
        int num2=Integer.valueOf(s3);
      get(num2);
       //System.out.println(num2);
    }
    public static void get(int n){
        int temp;
        Stack<Integer> stack=new Stack<>();
        while(n>0){
            temp=n%5;
            stack.push(temp);
            n=n/5;
        }
        while(!stack.empty()){
            int num4=stack.pop();
            System.out.println(num4);
        }
    }
}
