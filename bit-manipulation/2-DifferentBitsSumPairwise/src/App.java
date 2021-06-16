public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(cntBits(new int[] { 1,3,5 }));
    }

    /*     
    Some background : 
        If X = 0, Y = 0 Then X (XOR/^) Y = 0
        If X = 1, Y = 0 Then X ^ Y = 1
        XOR will onl set

    Algorithm: 
        Calculate the number of set bits and unset bits at all 32 bits for all elements
    */
    public static long cntBits(int[] A){

        long bitSum = 0;
        for(int i = 0; i < 31; i++){
            int setBitsAtI = 0;
            for(int elementIndex = 0; elementIndex < A.length; elementIndex++){
                if(((1 << i) & A[elementIndex]) > 0)
                    setBitsAtI+=1;
            }
            bitSum += (2L * setBitsAtI * (A.length - setBitsAtI));// Because XOR will set bit only if X and Y are different
        }
        return bitSum % ((long)Math.pow(10,9) + 7);
    }

    /*
    TC for below algo: O(N^2)

    public static int cntBits(int[] A) {
        //Time complexity : 
        int arraySize = A.length, bitSum = 0;
        for(int i = 0; i < arraySize - 1; i++){
            for(int j = i + 1; j < arraySize; j++){
                //X ^ Y => This will set bits at positions only where there are different bits
                bitSum += numberOfSetBits(A[i] ^ A[j]) % (Math.pow(10,9) + 7);
            }
        }
        return bitSum * 2;
    }

    private static int numberOfSetBits(int number){
        //Integer has 32 bits 
        int cntSetBits = 0;
        for(int i = 1; i <= 32; i++){
            //Left shifting 1 to i positions, AND with number to know if the number is set at that position
            //Other ways of doing this is RIGHT SHIFTING THE Number to i bits and computing AND 1
            //i.e, (N>>i) & 1
            if(((1 << i) & number) > 0)
                cntSetBits++;
        }

        return cntSetBits;
    }
    */
}
