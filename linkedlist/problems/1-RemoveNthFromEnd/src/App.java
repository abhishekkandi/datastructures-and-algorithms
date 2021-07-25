public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ListNode head = new ListNode(1);

        ListNode node2 = new ListNode(2);
        head.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode output = removeNthFromEnd(head, 2);
    }
    
    //Approach-1
    public static ListNode removeNthFromEnd(ListNode head, int N) {
        
        if(head == null)
            return null;

        int length = FindLinkedListLength(head);

        if(N >= length){
            //Remove first item
            head = head.next;
            return head;
        } 

        int NFromBeginning = length - N + 1;//Count from Beginning
        ListNode current = head;

        //NFromBeginning - 1 logic -> If 1,2,3,4,5 is list, N = 2, Then 4 need to be removed & 3 need to be pointed to 5
        for(int i = 1; i < NFromBeginning - 1; i++)
            current = current.next;

        current.next = current.next.next;

        return head;
    }

    public static int FindLinkedListLength(ListNode head){

        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }

        return length;
    }
    

    /*
        Below approach failing when list is [1] & N = 1
        where expected output is to return []
        but current returning [1]

        //Approach - 2 - Using 2 pointers - mainpointer, reference pointer
        //Initially creating window of N (BY moving ref pointer) & Later move mainptr, refptr till refptr points to NULL
        //Analogy of going to home which is 2nd from Deadend, Provided you can only go ahead(i.e, Traverse only once)
        public static ListNode removeNthFromEnd(ListNode head, int N) {

            if(head == null)
                return null;

            ListNode mainPtr = head;
            ListNode refPtr = head;
            ListNode prevPtr = null;

            for(int i = 0; i < N; i++){
                if(refPtr.next != null)
                    refPtr = refPtr.next;
                else 
                    return head;
            }
                

            if(refPtr == null){
                return head;
            }

            while(refPtr != null){
                prevPtr = mainPtr;
                mainPtr = mainPtr.next;
                refPtr = refPtr.next;
            }

            prevPtr.next = mainPtr.next;

            return head;
        }

    */
    
    
}
