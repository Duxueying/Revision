package day6_24;

public class JZ34 {
    public int FirstNotRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //indexof:���ص�һ�γ��ֵ�ָ���ַ����ڴ��ַ����е�����
            //ͬ���������һ�γ��ֵ�����
            if (str.indexOf(ch) == str.lastIndexOf(ch))
                return i;
        }
        return -1;
    }
}