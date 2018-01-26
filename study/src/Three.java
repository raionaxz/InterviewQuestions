import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by raiona on 2018/1/16.
 */


class ListNode {
int val;
ListNode next = null;
ListNode(int val) {
this.val = val;
}
}
public class Three {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        Stack<Integer> stack= new Stack();
//        ArrayList<Integer> arrayList= new ArrayList<>();
//        ListNode ln= listNode;
//        while(ln!=null){
//            stack.push(ln.val);
//            ln=ln.next;
//        }
//        while(!stack.empty()){
//            arrayList.add(stack.pop());
//        }
//        return arrayList;
//    }
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> arrayList= new ArrayList();
            if(listNode!=null){
                if(listNode.next!=null){
                    this.printListFromTailToHead(listNode.next);
                    arrayList.add(listNode.val);
                }
            }
            return arrayList;
        }
}
