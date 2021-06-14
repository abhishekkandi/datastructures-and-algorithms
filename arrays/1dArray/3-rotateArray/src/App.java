public class App {
    public static void main(String[] args) throws Exception {
        int[] orginalArray = new int[] { 1,2,3,4 };
        orginalArray = rotateArrayRightIndexAlgorithm(orginalArray, 200);
        printArray(orginalArray);
    }

    /*  
        For an Index i of an Array A, Upon rotating K times 
        it's new position will be (i + K) % A.length
        */
    private static int[] rotateArrayRightIndexAlgorithm(int[] originalArray, int kTimes){
        
        int sizeOfArray = originalArray.length;
        /* 
        Once the array is rotated by it's size times, 
        all the elements will go back to it's original postition
        */
        kTimes = kTimes % sizeOfArray; 
        int[] rotatedArray = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            int newPosition = (i + kTimes) % sizeOfArray;
            rotatedArray[newPosition] =originalArray[i];
        }       

        return rotatedArray;
    }

    // private static int[] rotateArrayRightOnce(int[] array){
    //     int[] result = new int[array.length];

    //     int temp = array[array.length - 1];
    //     for(int i = 0; i < array.length - 1; i++)
    //         result[i+1] = array[i];
        
    //     result[0] = temp;

    //     return result;
    // }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++)   
            System.out.print(array[i] + " ");
    }
}
