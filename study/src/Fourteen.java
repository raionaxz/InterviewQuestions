/**
 * Created by raiona on 2018/2/5.
 */
/*class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Fourteen {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0)
            return null;
        ListNode p1 = head;
        ListNode p2 = null;
        for (int i = 0; i < k - 1; i++) {
            if (p1.next != null) {
                p1 = p1.next;
            } else {
                return null;
            }
        }
        p2 = head;
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
