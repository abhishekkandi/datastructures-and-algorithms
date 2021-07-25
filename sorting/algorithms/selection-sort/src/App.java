public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] output = selectionSort(new int[] {64,25,12,22,11});
    }

    public static int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length; i ++){
            int minElement = Integer.MAX_VALUE;
            int minIndex = -1;

            //Finding the Minelement from i to N
            for(int j = i; j < arr.length; j++){
                if(arr[j] < minElement){
                    minElement = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = minElement;
            arr[minIndex] = temp;
        }

        return arr;
    }
}
