package day6_19;
/*��Ŀ����**������һ�������������β��ͷ��˳�򷵻�һ��ArrayList��
����˼·**����һ�������������Լ�дͷ�壬Ҳ���Ե���ArrayList�ķ��������ϵ�����0λ�ô���val*/
import java.util.ArrayList;
public class JZ3{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        if(listNode==null){
            return list;
        }
        while(listNode!=null){
            list.add(0,listNode.val);
            listNode=listNode.next;
        }
        return list;
    }
}