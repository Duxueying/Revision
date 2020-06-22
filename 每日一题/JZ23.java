package day6_22;
import java.util.Stack;
import java.util.Arrays;
public class JZ23 {
    public boolean VerifySquenceOfBST(int [] seq) {
        int[] mid = seq.clone();
        Arrays.sort(mid);
        return get(mid,seq);
    }
    //�жϺ����ǲ��������һ����������
    public boolean get(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0){
            return false;
        }
        Stack<Integer> stack= new Stack<Integer>();
        int index= 0;
        for(int i = 0; i< pushA.length;i++){
            stack.push(pushA[i]);//��push�����ӽ�ȥ
            //���ջ��Ϊ�գ���ջ��Ԫ�ص��ڵ�������
            while(!stack.empty() &&stack.peek() == popA[index]){
                stack.pop();//��ջ
                index++;
            }
        }
        return stack.empty();
    }
}
