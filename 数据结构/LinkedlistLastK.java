package NiuKe;
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class LinkedlistLastK {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<0){
            return null;
        }
        ListNode front=head;
        ListNode rear=head;
        while(k>0&&front!=null){//让front指针先走k步；
            k--;
            front=front.next;
        }
        while(front!=null){//front为空时，rear所在的位置就是第k个；
            front=front.next;
            rear=rear.next;
        }
        return k>0?null:rear;
    }
}
