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
            ListNode now_next=now.next;//����j��λ�� h i j
            if(now_next==null)
                new_head=now;//��ǰ�ڵ�����µ�ͷ���
            now.next=now_prev;//ָ�뷭ת
            now_prev=now;
            now=now_next;

        }
        return new_head;
    }/*
    �ݹ�
    if(head==null||head.next==null)
        return head;//����Ϊ�ջ�ֻ��1��Ԫ��
     ListNode prev=ReverseList(head.next);
     head.next.next=head;
     head.next=null;
     return prev;
    */
}
