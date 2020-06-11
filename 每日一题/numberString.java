import java.util.*;
public class numberString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str =input.nextLine();
        get(str);
    }
    public static void get(String s){
        char[] arr=s.toCharArray();
        int num=0,count=0,end=0;
        //String str=" ";
        for(int i=0;i<arr.length;i++) {
            if (arr[i] >= '1' && arr[i] <= '9') {
                count++;
                if (count > num) {
                    num = count;
                    end = i;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(s.substring(end-num+1,end+1));
    }
}

