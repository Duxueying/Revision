package day6_24;

public class JZ34 {
    public int FirstNotRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //indexof:返回第一次出现的指定字符串在此字符串中的索引
            //同理，返回最后一次出现的索引
            if (str.indexOf(ch) == str.lastIndexOf(ch))
                return i;
        }
        return -1;
    }
}