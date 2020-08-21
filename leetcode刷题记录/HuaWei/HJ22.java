package src.NiuKe.HuaWei;
/*某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，
喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？ */
import java.util.*;
public class HJ22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNextInt()){
            int num=input.nextInt();
            if(0==num){
                return;
            }
            System.out.println(get(num));
        }
    }
    public static int get(int num){
        if(1==num){
            return 0;
        }
        else if(2==num){
            return 1;
        }
        else{
            int a=num%3;
            int b=num/3;
            int c=a+b;
            return b+=get(c);
        }
    }
}
