package day6_22;
import java.util.Stack;
import java.util.Arrays;
public class JZ23 {
    public boolean VerifySquenceOfBST(int [] seq) {
        int[] mid = seq.clone();
        Arrays.sort(mid);
        return get(mid,seq);
    }
    //判断后序是不是中序的一个弹出序列
    public boolean get(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0){
            return false;
        }
        Stack<Integer> stack= new Stack<Integer>();
        int index= 0;
        for(int i = 0; i< pushA.length;i++){
            stack.push(pushA[i]);//用push把它加进去
            //如果栈不为空，且栈顶元素等于弹出序列
            while(!stack.empty() &&stack.peek() == popA[index]){
                stack.pop();//出栈
                index++;
            }
        }
        return stack.empty();
    }
}
