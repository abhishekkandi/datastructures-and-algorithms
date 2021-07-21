import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> arrayListStack = new ArrayList<>();

    public boolean isEmpty(){
        return arrayListStack.isEmpty();
    }

    public boolean push(int ele){
        System.out.println(ele + " is pushed into the stack.");
        return arrayListStack.add(ele);
    }

    public int pop(){
        if(arrayListStack.isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        System.out.println(this.peek() + " has been popped out of the stack.");
        return arrayListStack.remove(arrayListStack.size() - 1);
    }

    //Others may refer peek() as top()
    public int peek(){
        return arrayListStack.get(arrayListStack.size() - 1);
    }
}
