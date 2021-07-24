public class SinglyLinkedList {
    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    // used to insert a node at the start of linked list
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // used to insert a node at the start of linked list
    public void insertLast(int data){
        Node current = head;
        while(current.next != null){
            current = current.next;//Looping till end of the linked list
        }
        Node newNode = new Node(data);
        newNode.next = null;
        current.next = newNode;
    }

    //Used to delete node from start of the linked list
    public Node deleteFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }    

    public void printLinkedList(){

        System.out.println("Printing Linked List from (head -> last)");
        Node current = head;

        while(current != null){
            current.displayNodeData();
            current = current.next;
        }

        System.out.println();
    }
}
