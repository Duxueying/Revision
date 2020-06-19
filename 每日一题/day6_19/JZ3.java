package day6_19;
/*题目描述**：输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
解题思路**：建一个新链表，可以自己写头插，也可以调用ArrayList的方法，不断地往它0位置处加val*/
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