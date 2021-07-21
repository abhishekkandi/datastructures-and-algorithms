import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Passing Game!");
        int output = solve(10,23, new int[]{86, 63, 60, 0, 47, 0, 99, 9, 0, 0});
        System.out.println("output: " + output);
    }

    public static int solve(int A, int B, int[] C) {
        ArrayListStack arrayListStack = new ArrayListStack();
        arrayListStack.push(B);
        for(int ele : C){
            if(ele == 0){
                arrayListStack.pop();
            } else {
                arrayListStack.push(ele);
            }
        }
        
        return arrayListStack.peek();
    }
}

class ArrayListStack {
    ArrayList<Integer> arrayListStack = new ArrayList<>();

    public boolean isEmpty(){
        return arrayListStack.isEmpty();
    }

    public boolean push(int ele){
        return arrayListStack.add(ele);
    }

    public int pop(){
        return arrayListStack.remove(arrayListStack.size() - 1);
    }

    //Others may refer peek() as top()
    public int peek(){
        return arrayListStack.get(arrayListStack.size() - 1);
    }
}
