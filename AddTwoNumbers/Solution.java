public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        ListNode curr = null;
        boolean overflow = false;
    
        while (l1 != null && l2 != null) {
            curr = l1;

            if (overflow) {
                curr.val++;
                overflow = false;
            }

            curr.val += l2.val;

            if (curr.val >= 10) {
                curr.val -= 10;
                overflow = true;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode tail = l1 != null ? l1 : l2;
        if (tail != null) {
            curr.next = tail;
            
            while (tail != null) {
                if (overflow) {
                    tail.val++;
                    overflow = false;
                }

                if (tail.val >= 10) {
                    tail.val -= 10;
                    overflow = true;
                }

                curr = tail;
                tail = tail.next;
            }
        }

        if (overflow)
            curr.next = new ListNode(1);
        
        return result;
    }
}