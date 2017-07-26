package LinkedList;

/**
 * Created by Mew on 2017/7/26.
 */
public class FindKthToTail {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {

        ListNode l1 = head;
        ListNode l2 = head;
        int cnt =0;
        while(null!=l1){
            if(cnt>=k){
                l2=l2.next;
            }
            cnt++;
            l1=l1.next;
        }
        if (cnt>k){
            return null;
        }
        return l2;
    }
}
