package day6_26;

public class JZ44{
    public String ReverseSentence(String str) {
        if (str.trim().length()==0) {//×Ö·û´®Îª0·µ»Ø×Ö·û´®
            return str;
        }
        String[] arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = arr.length-1; i >0; i--) {
            sb.append(arr[i]+" ");//zÖğ¸öÌí¼Ó
        }
        sb.append(arr[0]);
        return sb.toString();
    }
}