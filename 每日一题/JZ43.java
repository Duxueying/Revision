package day6_26;
public class JZ43 {
    public String LeftRotateString(String str,int n) {
        if(str == null||n<0){
            return null;
        }
        String string = new String();
        if(n <= str.length()) {
            //substring����ǰ��������
            StringBuffer sb = new StringBuffer(str.substring(n, str.length()));
            String s1 = str.substring(0, n);
            string = sb.append(s1).toString();

        }
        return string;
    }
}