import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] result = findNonThriceRepeatingNumbers(new int[]{ 1,2,1,2,4,3 });
        System.out.println(Arrays.toString(result));
    }

    /* 
        Compute XOR for all elements in array which will give us X ^ Y
        Now the task is to find X and Y
        Find any Set Bit position, let's consider it as K bit        
    */
    public static int[] findNonThriceRepeatingNumbers(int[] A) {
        
        int entireArrayXORValue = 0;//0 is the identity of XOR -> a ^ 0 = a
        for(int i = 0; i < A.length; i++){
            entireArrayXORValue ^= A[i];
        }
        
        int xorSet = 0, xorUnset = 0;
        int setBitPosition = findAnySetBitPosition(entireArrayXORValue);
        if(setBitPosition == -1)
            return new int[2];

        for(int i = 0; i < A.length; i++){
            if(((1 << setBitPosition) & A[i]) > 0)
                xorSet ^= A[i];
            else 
                xorUnset ^= A[i];
        }
        
        return new int[] { Math.min(xorSet,xorUnset), Math.max(xorSet, xorUnset)};
    }

    private static int findAnySetBitPosition(int number){
        int setBitPosition = -1;
        for(int i = 0; i < 32; i++){
            if(((1 << i) & number) > 0){
                setBitPosition = i;
                break;
            }
        }
        return setBitPosition;
    }
}
