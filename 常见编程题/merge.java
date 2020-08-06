package src.NiuKe;

public class merge {
    public ListNode merge(ListNode node1,ListNode node2){
        if(node1==null){
            return node2;
        }
        if(node2==null){
            return node1;
        }
        ListNode node=new ListNode(0);
        ListNode pr1=node1,pr2=node2;
        ListNode result=node;
        while(pr1!=null&&pr2!=null){
            if(pr1.val<pr2.val){
                result.next=pr1;
                result=pr1;
                pr1=pr1.next;
            }
            else{
                result.next=pr2;
                result=pr2;
                pr2=pr2.next;
            }
        }
        if(pr1!=null){
            result.next=pr1;
        }
        if(pr2!=null){
            result.next=pr2;
        }
        return node.next;
    }
}
