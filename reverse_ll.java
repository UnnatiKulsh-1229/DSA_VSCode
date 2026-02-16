import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class reverse_ll {

    // recursive reverse function
    public ListNode reverse_ll(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newhead = reverse_ll(head.next);

        head.next.next = head;
        head.next = null;

        return newhead;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode newNode = new ListNode(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // create object to call non-static function
        reverse_ll obj = new reverse_ll();
        ListNode newhead = obj.reverse_ll(head);

        while (newhead != null) {
            System.out.print(newhead.val + " ");
            newhead = newhead.next;
        }

        sc.close();
    }
}
