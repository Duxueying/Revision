package src.NiuKe;

public class firstChar {
    public static void main(String[] args) {
        String str="aaddvveddtuuo";//A-Z是65-90；a-z是97-122；比如g=103-65=38
        int[] words=new int[58];
        for(int i=0;i<str.length();i++){
            words[((int)str.charAt(i))-65]+=1;
        }
        for(int i=0;i<str.length();i++){
            if(words[((int)str.charAt(i))-65]==1){
               System.out.println(i);
            }
        }
    }
}
