public class App {
    public static void main(String[] args) throws Exception {
        int[] orginalArray = new int[] { 1,2,3,4 };
        
        int k = 199;
        k = k % orginalArray.length;
        for(int i = 1; i <=k; i++)
            orginalArray = rotateArrayRightOnce(orginalArray);
        printArray(orginalArray);
    }

    private static int[] rotateArrayRightOnce(int[] array){
        int[] result = new int[array.length];

        int temp = array[array.length - 1];
        for(int i = 0; i < array.length - 1; i++)
            result[i+1] = array[i];
        
        result[0] = temp;

        return result;
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++)   
            System.out.print(array[i] + " ");
    }
}
