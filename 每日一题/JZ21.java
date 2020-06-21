package day6_20;
/*题目描述**：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺
。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应
的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 解题思路：新创建一个栈，把第一个数组压栈，如果第二个数组的元素和栈内的元素相等就弹出，
 遍历完之后，如果栈内为空，则说明是它弹出的一个序列*/

import java.util.ArrayList;
import java.util.Stack;
public class JZ21{
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0){//判断输入是否为空
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j=0;
        for(int i=0;i<popA.length;i++){
            stack.push(pushA[i]);
            while(j<popA.length&&stack.peek()==popA[j]){//相等就弹出
                stack.pop();
                j++;
            }
        }
        return stack.empty()?true:false;
    }
}
