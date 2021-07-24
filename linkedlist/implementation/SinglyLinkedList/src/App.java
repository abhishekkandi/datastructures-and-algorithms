public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.insertLast(2);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.deleteFirst();
        singlyLinkedList.printLinkedList();
    }
}
