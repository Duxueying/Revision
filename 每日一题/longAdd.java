import java.util.*;
import java.math.BigInteger;
public class longAdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str1=input.nextLine();
            String str2=input.nextLine();
            BigInteger num1=new BigInteger(str1);//BigInteger����ֱ�ӽ��д���������
            BigInteger num2=new BigInteger(str2);
            System.out.println(num1.add(num2));
        }
    }
}
