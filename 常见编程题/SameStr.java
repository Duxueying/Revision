package src.niuKe;
//两个字符串的最长公共子串
public class SameStr {
    public static void main(String[] args) {
        String max="abcdef";
        String min="def";
        System.out.println(solution(max,min));
    }
    public static String solution(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        if(str1.contains(str2)){
            return str2;
        }
        for(int i=0;i<len2;i++){
            for(int start=0,end=len2-i;end<len2;start++,end++){
                String temp=str2.substring(start,end);
                if(str1.contains(temp)){
                    return temp;
                }
            }
        }
        return null;
    }
}
