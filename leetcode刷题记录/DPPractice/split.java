package src.DPPractice;
import java.util.Set;
public class split {
        public boolean wordBreak(String s, Set<String> dict) {
            boolean[] arr=new boolean[s.length()+1];
            arr[0]=true;//假设一个初始值
            for(int i=1;i<=s.length();i++){
                for(int j=i-1;j>=0;j--){
                    if(arr[j]&&dict.contains(s.substring(j,i))){
                        arr[i]=true;
                        break;
                    }
                }
            }
            return arr[s.length()];
        }
}
