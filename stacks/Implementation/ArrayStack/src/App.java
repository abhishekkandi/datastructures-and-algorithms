public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("---STACKS USING STATIC ARRAY----");
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
        System.out.println("-------------------------------");

        System.out.println("---STACKS USING DYNAMIC ARRAY----");
        ArrayListStack arrayListStack = new ArrayListStack();
        System.out.println("Is Stack Empty: " + arrayListStack.isEmpty());
        arrayListStack.push(10);
        arrayListStack.push(20);
        arrayListStack.push(30);
        arrayListStack.push(40);
        System.out.println("Top element in the stack: " + arrayListStack.peek());
        arrayListStack.pop();
        arrayListStack.pop();
        System.out.println("Top element in the stack: " + arrayListStack.peek());
        System.out.println("Is Stack Empty: " + arrayListStack.isEmpty());
        System.out.println("-------------------------------");
    }
}
