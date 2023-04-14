package easy.RemoveDuplicatesSortList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicatesSortList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode prev = head;
        ListNode p = head.next;
        while (p != null) {
            if (p.val == prev.val) {
                prev.next = p.next;
            } else {
                prev = p;
            }
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        ListNode result = deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
