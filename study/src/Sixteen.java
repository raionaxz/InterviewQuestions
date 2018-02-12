/**
 * Created by raiona on 2018/2/5.
 */
public class Sixteen {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)return list2;
        if(list2==null) return list1;
        ListNode list=null;
        if(list1.val<list2.val){
            list=list1;
            list.next=Merge(list1.next,list2);
        }
        else {
            list=list2;
            list.next=Merge(list1,list2.next);
        }
        return list;
    }
}
