
public class JZ14{
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode node=head;
        int count=0;
        if(head==null){//˵���ǿ�����
            return head;
        }
        while(node!=null){//ͳ�ƽڵ�
            count++;
            node=node.next;
        }
        if(count<k){//����Ϸ����ж�
            return null;
        }
        ListNode cur=head;
        for(int i=0;i<count-k;i++){//��ǰ�������
            cur=cur.next;
        }
        return cur;
    }
}