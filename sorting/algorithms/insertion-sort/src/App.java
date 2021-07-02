public class App {
    public static void main(String[] args) throws Exception {
        int[] inputArray = new int[] { 5,1,3,2 };
        insertionSort(inputArray);
        printIntegerArray(inputArray);
    }

    private static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int index = i;
            while(index > 0 && array[index-1] > array[index]){
                swap(array, index-1, index);
                index--;
            }
        }
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printIntegerArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
