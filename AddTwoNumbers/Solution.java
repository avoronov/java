public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode curr = null; 
        boolean overflow = false;
    
        while (l1 != null || l2 != null) {
            int val = 0;

            if (overflow) {
                val++;
                overflow = false;
            }

            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }

            if (val >= 10) {
                val -= 10;
                overflow = true;
            }

            ListNode tmp = new ListNode(val);

            if (curr != null) {
                curr.next = tmp;
            }

            curr = tmp;

            if (result == null) {
                result = curr;
            }
        }

        if (overflow) {
            ListNode tmp = new ListNode(1);
            curr.next = tmp;
            // curr = tmp;
            // overflow = false;
        }
        
        return result;
    }
}