public class ArrayStack {
    int top;
    static final int MAX_SIZE = 1000;
    int[] arrayStack = new int[MAX_SIZE];

    public ArrayStack(){
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(int ele){
        if(top <= MAX_SIZE - 1){
            arrayStack[++top] = ele;    
            System.out.println(ele + " is pushed into the stack.");    
            return true;
        } else {
            System.out.println("Stack overflow");
            return false;
        }
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        } else {
            int topElement = arrayStack[top--];
            System.out.println(topElement + " has been popped out of the stack.");
            return topElement;
        }
    }

    //Others may refer peek() as top()
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        } else {
            return arrayStack[top];
        }
    }

}