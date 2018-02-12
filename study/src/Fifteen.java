/**
 * Created by raiona on 2018/2/5.
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Fifteen {
    public ListNode ReverseList(ListNode head) {
        if(head==null)return null;
        ListNode now=head;
        ListNode now_prev=null;
        ListNode new_head=null;
        while(now!=null){
            ListNode now_next=now.next;//保留j的位置 h i j
            if(now_next==null)
                new_head=now;//当前节点就是新的头结点
            now.next=now_prev;//指针翻转
            now_prev=now;
            now=now_next;

        }
        return new_head;
    }/*
    递归
    if(head==null||head.next==null)
        return head;//链表为空或只有1个元素
     ListNode prev=ReverseList(head.next);
     head.next.next=head;
     head.next=null;
     return prev;
    */
}
