package day6_20;

/**����˼·**������һ���µ���������list1λ�õ�ֵlist2λ�õ�ֵȥ�����µ�����ȥ�������������ֵ��˳��
��С������ӣ�*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2){
        if(list1==null){//��������Ϊ�յ����
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode node=new ListNode(0);
        ListNode pr1=list1,pr2=list2;
        ListNode result=node;
        while(pr1!=null&&pr2!=null){//ȥ�ж�����valֵ�ô�С����result���������Ķ�����
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
        if(pr1!=null)//�ж����ʣ����pr1����pr2��
            result.next=pr1;
        if(pr2!=null)
            result.next=pr2;
        return node.next;
    }
}
