public class App {
    public static void main(String[] args) throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode head = node1;
        head = reverseNodes(head,2);
    }

    private static ListNode reverseNodes(ListNode head, int k){
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;

        int count = 0;

        while(count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if(next != null)
            head.next = reverseNodes(next, k);
        
        return prev;
    }
}
