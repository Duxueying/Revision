package day6_19;
/***题目描述**：请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 解题思路：用的是StringBuffer的方法，从后往前遍历，如果它等于空格，就删了，然后把%20插进去。*/
public class JZ2{
    public String replaceSpace(StringBuffer str) {
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){//charAt(i):获得i位置的元素
                str.deleteCharAt(i);
                str.insert(i,"%20");
            }
        }
        return str.toString();//转成字符串
    }
}
