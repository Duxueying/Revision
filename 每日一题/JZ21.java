package day6_20;
/*��Ŀ����**�����������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳
������ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ
��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 ����˼·���´���һ��ջ���ѵ�һ������ѹջ������ڶ��������Ԫ�غ�ջ�ڵ�Ԫ����Ⱦ͵�����
 ������֮�����ջ��Ϊ�գ���˵������������һ������*/

import java.util.ArrayList;
import java.util.Stack;
public class JZ21{
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0){//�ж������Ƿ�Ϊ��
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j=0;
        for(int i=0;i<popA.length;i++){
            stack.push(pushA[i]);
            while(j<popA.length&&stack.peek()==popA[j]){//��Ⱦ͵���
                stack.pop();
                j++;
            }
        }
        return stack.empty()?true:false;
    }
}
