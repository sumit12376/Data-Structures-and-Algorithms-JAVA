public class ll_Intersection {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode temp1 = headA;
            ListNode temp2 = headB;
            int length1 = 0;
            int length2 = 0;

            // Calculate the length of list A
            while (temp1 != null) {
                length1++;
                temp1 = temp1.next;
            }

            // Calculate the length of list B
            while (temp2 != null) {
                length2++;
                temp2 = temp2.next;
            }

            temp1 = headA;
            temp2 = headB;

            // Align the start of the two lists
            if (length1 > length2) {
                int steps = length1 - length2;
                for (int i = 0; i < steps; i++) {
                    temp1 = temp1.next;
                }
            } else {
                int steps = length2 - length1;
                for (int i = 0; i < steps; i++) {
                    temp2 = temp2.next;
                }
            }

            // Find the intersection node
            while (temp1 != null && temp2 != null && temp1 != temp2) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            return temp1;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next=d;
        ListNode e = new ListNode(3);

        // ListNode e = new ListNode(13);
        // ListNode f = new ListNode(53);
        e.next = c;
        d.next= new ListNode(4);
        // e.next = f;

        // Set the intersection point (e.g., connecting node c and node f)
        // f.next = c;

        // Find the intersection
        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(a, d);

        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
