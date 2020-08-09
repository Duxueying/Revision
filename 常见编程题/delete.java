package src.NiuKe;

import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str1=input.nextLine();
            String str2=input.nextLine();
            char[] arr=str1.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(!str2.contains(String.valueOf(arr[i]))){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
