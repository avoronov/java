import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode buildFrom(List<Integer> array) {
        ListNode result = null;
        ListNode curr = null;

        for (int val : array) {
            ListNode tmp = new ListNode(val);

            if (curr != null) {
                curr.next = tmp;
            }

            curr = tmp;

            if (result == null) {
                result = curr;
            }
        }

        return result;
    }

    public static String toString(ListNode l) {
        StringBuilder builder = new StringBuilder();

        boolean isFirst = true;
        while (l != null) {
            if (isFirst) {
                isFirst = false;
            } else {
               builder.append(" -> ");
            }
            builder.append(l.val);
            l = l.next;
        }

        return builder.toString();
    }

}