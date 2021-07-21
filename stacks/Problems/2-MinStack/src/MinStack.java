import java.util.ArrayList;

public class MinStack {
    ArrayList<Integer> normalArrayList = new ArrayList<>();
    ArrayList<Integer> minArrayList = new ArrayList<>();
    
    public void push(int newElement) {
        normalArrayList.add(newElement);

        if(minArrayList.isEmpty()){
            minArrayList.add(newElement);
        } else {
            int minElement = minArrayList.get(minArrayList.size() - 1);
            if(newElement < minElement){
                minArrayList.add(newElement);
            }
        }
    }

    public void pop() {
        if(!normalArrayList.isEmpty()){
            int topElement = normalArrayList.get(normalArrayList.size() - 1);
            normalArrayList.remove(normalArrayList.size() - 1);

            int minElement = minArrayList.get(minArrayList.size() - 1);
            if(topElement == minElement){
                minArrayList.remove(minArrayList.size() - 1);
            }
        }
    }

    public int top() {
        if(normalArrayList.isEmpty())
            return -1;
        
        return normalArrayList.get(normalArrayList.size() - 1);
    }

    public int getMin() {
        if(normalArrayList.isEmpty())
            return -1;
        
        return minArrayList.get(minArrayList.size() - 1);
    }
}