import java.util.Scanner;

public class explainPassword {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){//≤ª∂œ ‰»Î
            String str=input.nextLine();
            char[] arr=str.toCharArray();
            int len=str.length();
            for(int i=0;i<arr.length;i++){
                char c =arr[i];
                if('A'<=c){
                    c=(char)('E'<c?(c-5):(c+21));
                    arr[i]=c;
                }
            }
            System.out.println(new String(arr));
        }
    }
}
