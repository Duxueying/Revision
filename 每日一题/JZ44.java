package day6_26;

public class JZ44{
    public String ReverseSentence(String str) {
        if (str.trim().length()==0) {//�ַ���Ϊ0�����ַ���
            return str;
        }
        String[] arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = arr.length-1; i >0; i--) {
            sb.append(arr[i]+" ");//z������
        }
        sb.append(arr[0]);
        return sb.toString();
    }
}