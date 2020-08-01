package src.BaiDu;
import java.util.Scanner;
//ip的格式：（1-255）.(0-255).(0-255).(0-255)
public class isIp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ipStr=input.next();
        System.out.println(isIp(ipStr));
    }
    public static boolean isIp(String str){
        if(str==null){//字符串为空，说明不是
            return false;
        }
        if(str.length()<7||str.length()>15){//长度不符合要求，说明不是
            return false;
        }
        if(str.charAt(0)=='.'||str.charAt(str.length()-1)=='.');
        //以.作为分隔符，分割出来长度不为4也是非法ip
        String[] arr=str.split("\\.");
        System.out.println(arr.length);
        if(arr.length!=4){
            System.out.println("length!=4");
            return false;
        }
        for(int i=0;i<arr.length;i++){//192.168.0.0
            if(arr[i].length()>1 && arr[0].charAt(0)=='0'){
                return false;
            }
            //对字符串中的每个字符进行逐一判断
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)<'0'||arr[i].charAt(j)>'9'){
                    return false;
                }
            }
        }
        //把拆分的字符串转换为数字进行判断
        for(int i=0;i<arr.length;i++){
            int part=Integer.parseInt(arr[i]);
            if(i==0){
                if(part<1||part>255){
                    return false;
                }
                else
                {
                    if(part<0||part>255){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
