package src.LeetCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class str{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=null;
        while(input.hasNext()){
            str=input.nextLine();
            if(str==null||str.length()==0){
                System.out.println(-1);
            }
            System.out.println(find(str));
        }
    }
    public static char find(String str){

        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<str.length();i++){//aaddcde
            if(map.containsKey(str.charAt(i))){//如果包含就给value++；
                count=map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
            else
            {
                map.put(str.charAt(i),1);//不包含就放进去，个数置1
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
        return '0';
    }
}
