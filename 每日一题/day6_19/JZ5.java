package day6_19;

/*题目描述**：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
        **解题思路**：栈是先进后出 ，队列是先进先出
        先将元素压入stack1,再反序到stack2中，在一一弹出，就实现了队列*/
import java.util.Stack;
public class JZ5{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){//判空
                stack2.push(stack1.pop());//返回栈顶元素
            }
        }
        return stack2.pop();
    }
}