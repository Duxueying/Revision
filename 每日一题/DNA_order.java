import java.util.*;
public class DNA_order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = " ";
        while ((str = input.nextLine()) != null) {
            int n = input.nextInt();
            get(str, n);
        }
    }

    public static void get(String s, int n) {
        int num2 = 0;
        int count = 0;
        int len = s.length();
        String str = " ";
        for (int i = 0; i <= len - n; i++) {//��һ��ѭ���������������
            for (int j = i; j < i + n; j++) {//�ڶ���ѭ�����������N������������G��C�ĸ���
                if (s.charAt(j) == 'G' || s.charAt(j) == 'C') {
                    count++;
                }
                if (count > num2) {
                    num2 = count;
                    str = s.substring(i, i + n);//��substring�����������
                }
            }
        }
        System.out.println(str);
    }
}
