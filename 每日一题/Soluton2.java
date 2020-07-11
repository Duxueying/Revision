import java.util.Scanner;

public class Soluton2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();

        String[] strArr=str.trim().split(" ");
        String result="";
        for(int i=strArr.length-1;i>0;i--){
            result=result+strArr[i]+" ";
        }
        result+=strArr[0];
        System.out.println(result);
    }
}
