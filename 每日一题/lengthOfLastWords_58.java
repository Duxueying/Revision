package LeetCode;

public class lengthOfLastWords_58 {
    public int lengthOfLastWord(String s) {
        String[] splits = s.split(" ");
        if(splits.length==0){
            return 0;
        }
        return splits[splits.length - 1].length();
    }
}
