public class Main {
	public static void main(String[] args) {
        // ListNode l1 = buildList(new int[]{2,4,3});
        // ListNode l2 = buildList(new int[]{5,6,4});

        // ListNode l1 = buildList(new int[]{5});
        // ListNode l2 = buildList(new int[]{5});

        // ListNode l1 = buildList(new int[]{0});
        // ListNode l2 = buildList(new int[]{7,3});

        // ListNode l1 = buildList(new int[]{9, 8});
        // ListNode l2 = buildList(new int[]{1});

        ListNode l1 = buildList(new int[]{1});
        ListNode l2 = buildList(new int[]{9,9});

        // printList(l1);
        // printList(l2);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        printList(result);
    }
    
    private static ListNode buildList(int[] array) {
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

    private static void printList(ListNode l) {
        System.out.println();

        boolean isFirst = true;
        while (l != null) {
            if (isFirst) {
                isFirst = false;
            } else {
                System.out.print(" -> ");
            }
            System.out.printf("%d", l.val);
            l = l.next;
        }

        System.out.println();
    }
}

