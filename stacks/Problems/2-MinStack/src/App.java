public class App {
    public static void main(String[] args) throws Exception {
        MinStack minStack = new MinStack();
        minStack.push(20);
        minStack.push(10);
        minStack.push(100);
        minStack.push(5);
        System.out.println("Min element: " + minStack.getMin());
        minStack.pop();
        System.out.println("Min element: " + minStack.getMin());
    }
}
