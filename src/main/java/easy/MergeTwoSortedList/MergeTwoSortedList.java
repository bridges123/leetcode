package easy.MergeTwoSortedList;

public class MergeTwoSortedList {
    static class ListNode {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
        Good one.

        ListNode result = new ListNode();
        ListNode pointer = result;

        while (list1 != null || list2 != null) {
            ListNode elem;
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    elem = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    elem = new ListNode(list2.val);
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                elem = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                elem = new ListNode(list2.val);
                list2 = list2.next;
            }
            pointer.next = elem;
            pointer = pointer.next;
        }

        return result.next;

        Perfect |
                v
         */

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode result = new ListNode();

        if (list1.val < list2.val) {
            result.val = list1.val;
            list1 = list1.next;
        } else {
            result.val = list2.val;
            list2 = list2.next;
        }
        ListNode pointer = result;

        while (list1 != null || list2 != null) {
            pointer.next = new ListNode();
            pointer = pointer.next;
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    pointer.val = list1.val;
                    list1 = list1.next;
                } else {
                    pointer.val = list2.val;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                pointer.val = list1.val;
                list1 = list1.next;
            } else {
                pointer.val = list2.val;
                list2 = list2.next;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(); // 1 2 4
        list1.val = 1;
        list1.next = new ListNode();
        list1.next.val = 2;
        list1.next.next = new ListNode();
        list1.next.next.val = 4;

        ListNode list2 = new ListNode(); // 1 3 4
        list2.val = 1;
        list2.next = new ListNode();
        list2.next.val = 3;
        list2.next.next = new ListNode();
        list2.next.next.val = 4;

        ListNode result = mergeTwoLists(list1, list2);
        if (result != null) {
            while (result != null) {
                System.out.println(result.val);
                result = result.next;
            }
            System.out.println("OK");
        }
    }
}
