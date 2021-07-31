public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] output = bubbleSort(new int[]{5,1,4,2,8}, 5);
    }

    public static int[] bubbleSort(int[] arr, int n){
        //In every iteration, We will traverse from end of the array 
        //and keep checking adjacent elements and swap them if there in descending order
        //We will keep making the left sub array sorted
        for(int i = 0; i < n; i++){
            int swapCount = 0;
            for(int j = n - 1; j >= i+1; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0)
                break;
        }

        return arr;
    }
}
