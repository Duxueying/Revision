import java.util.Scanner;
/*λ������������'��'�Ľ��һ�£�
λ�����������'��λ���Ľ��һ�£� */
public class OffbeatAddtion {
    public static int Add(int A, int B){
        while(B!=0){
            int sum=A^B;
            int jin=(A&B)<<1;
            A=sum;
            B=jin;

        }
        return A;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int ans= Add(num1,num2);
        System.out.println(ans);
    }
}
