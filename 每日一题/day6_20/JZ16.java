package day6_20;

/**解题思路**：定义一个新的链表，根据list1位置的值list2位置的值去，让新的链表去把这两个链表的值按顺序
大小依次添加，*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2){
        if(list1==null){//分析链表为空的情况
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode node=new ListNode(0);
        ListNode pr1=list1,pr2=list2;
        ListNode result=node;
        while(pr1!=null&&pr2!=null){//去判断两个val值得大小决定result接下来往哪儿遍历
            if(pr1.val<=pr2.val){
                result.next=pr1;
                result=pr1;
                pr1=pr1.next;
            }else{
                result.next=pr2;
                result=pr2;
                pr2=pr2.next;
            }
        }
        if(pr1!=null)//判断最后剩的是pr1还是pr2的
            result.next=pr1;
        if(pr2!=null)
            result.next=pr2;
        return node.next;
    }
}
