package day6_19;

/*��Ŀ����**��������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
        **����˼·**��ջ���Ƚ���� ���������Ƚ��ȳ�
        �Ƚ�Ԫ��ѹ��stack1,�ٷ���stack2�У���һһ��������ʵ���˶���*/
import java.util.Stack;
public class JZ5{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){//�п�
                stack2.push(stack1.pop());//����ջ��Ԫ��
            }
        }
        return stack2.pop();
    }
}