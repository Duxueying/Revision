package lab;
import java.util.*;
public class StrToInt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(get(str));
    }
    public static int get(String str) {
        if(str==null||str.length()==0) {//如果输入的字符串为空。直接返回0
            return 0;
        }
        boolean tag=false;
        int sum=0;
        char arr[]=str.toCharArray();//将字符串转换为字符数组
        if(arr[0]=='-') {//如果第一个字符为负号，则标志位要进行变号。
            tag = true;
        }
        for(int i=0;i<arr.length;i++){
            if(i==0&&(arr[i]=='+'||arr[i]=='-')) {//第一个元素为正或者负才能继续往下判断
                continue;
            }
            if(arr[i]<'0'||arr[i]>'9') {//如果这个字符不在0到9范围内说明输入不合法
                return 0;
            }
            sum=sum*10+(arr[i]-'0');//到这儿就可以计算这个int数了
        }
        return tag?(0-sum):sum;//用三母运算符来return结果
    }
}
