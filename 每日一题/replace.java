package LeetCode;

public class replace {
    public String replaceSpace(StringBuffer str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        int newlen=str.length()+2*count;
        int newend=newlen-1;
        int old=str.length()-1;
        str.setLength(newlen);
        while(old>=0&&newend>=0){
            if(str.charAt(old)==' '){
                str.setCharAt(newend--,'0');
                str.setCharAt(newend--,'2');
                str.setCharAt(newend--,'%');
                old--;
            }
            else{
                str.setCharAt(newend,str.charAt(old));
                old--;
                newend--;
            }
        }
        return str.toString();
    }
}
