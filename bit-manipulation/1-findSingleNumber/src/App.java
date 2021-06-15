public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(singleNumber(new int[]{1,3,2,1,2}));
    }

    public static int singleNumber(final int[] A) {
        /* 
            As a ^ a = 0, Taking XOR on entire array will leave only one element 
            which is occuring only once
        */
        int output = 0;
        for(int i = 0; i < A.length; i++){
            output ^= A[i];
        }

        return output;
    }
}
