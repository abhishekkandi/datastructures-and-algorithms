public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(binarySearch(new int[] {1,4,7,9,20}, 4, 0, 4));
    }

    public static int binarySearch(int[] arr, int key, int leftIndex, int rightIndex){
        while(leftIndex <= rightIndex){
            int midIndex = leftIndex + ((rightIndex - leftIndex)/2);

            if(arr[midIndex] == key){
                return midIndex;
            } else if(arr[midIndex] > key){
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }

        return -1;
    }
}
