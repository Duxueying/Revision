package LeetCode;

public class mergelist_21 {
    /*定义一个新链表，根据list1位置和list2位置的值，让新链表按顺序添加*/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){//分析链表为空情况
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode node=new ListNode(0);
        ListNode pr1=l1,pr2=l2;
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
        if(pr1!=null){//判断最后剩的是pr1还是pr2
            result.next=pr1;
        }
        if(pr2!=null){
            result.next=pr2;
        }
        return node.next;
    }
}
