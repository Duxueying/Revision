package lab;
import java.util.*;
public class StrToInt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(get(str));
    }
    public static int get(String str) {
        if(str==null||str.length()==0) {//���������ַ���Ϊ�ա�ֱ�ӷ���0
            return 0;
        }
        boolean tag=false;
        int sum=0;
        char arr[]=str.toCharArray();//���ַ���ת��Ϊ�ַ�����
        if(arr[0]=='-') {//�����һ���ַ�Ϊ���ţ����־λҪ���б�š�
            tag = true;
        }
        for(int i=0;i<arr.length;i++){
            if(i==0&&(arr[i]=='+'||arr[i]=='-')) {//��һ��Ԫ��Ϊ�����߸����ܼ��������ж�
                continue;
            }
            if(arr[i]<'0'||arr[i]>'9') {//�������ַ�����0��9��Χ��˵�����벻�Ϸ�
                return 0;
            }
            sum=sum*10+(arr[i]-'0');//������Ϳ��Լ������int����
        }
        return tag?(0-sum):sum;//����ĸ�������return���
    }
}
