public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack arrayStack = new ArrayStack();
        System.out.println("Is Stack Empty: " + arrayStack.isEmpty());
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.push(40);
        System.out.println("Top element in the stack: " + arrayStack.peek());
        arrayStack.pop();
        arrayStack.pop();
        System.out.println("Top element in the stack: " + arrayStack.peek());
        System.out.println("Is Stack Empty: " + arrayStack.isEmpty());
    }
}
