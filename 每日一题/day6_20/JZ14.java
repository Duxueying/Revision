
public class JZ14{
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode node=head;
        int count=0;
        if(head==null){//说明是空链表
            return head;
        }
        while(node!=null){//统计节点
            count++;
            node=node.next;
        }
        if(count<k){//输入合法性判断
            return null;
        }
        ListNode cur=head;
        for(int i=0;i<count-k;i++){//从前往后遍历
            cur=cur.next;
        }
        return cur;
    }
}