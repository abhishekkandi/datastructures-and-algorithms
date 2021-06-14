import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(findRank("bca"));
    }

    private static int MOD = 1000003;
    public static int findRank(String S) {
    
        // Initializations
        ArrayList<Integer> charCount = new ArrayList<Integer>(256);
        
        for(int i=0;i<256;i++) charCount.add(0);
        for (int i = 0; i < S.length(); i++) {
            int ch = (int)S.charAt(i);
            charCount.set(ch, charCount.get(ch)+1);
        }
        
        ArrayList<Integer> fact = new ArrayList<Integer>(); // fact[i] will contain i! % MOD
        initializeFactorials(S.length() + 1, fact);
        
        long rank =  1;
        
        for (int i = 0; i < S.length(); i++) {
            // find number of permutations placing character smaller than S[i] at ith position 
            // among characters from i to S.length 
            long less = 0;
            int remaining = S.length() - i - 1;
            for (int ch = 0; ch < S.charAt(i); ch++) {
                if (charCount.get(ch) == 0) continue;
                // Lets try placing ch as the first character in remaining characters
                // and check the number of permutation possible.
                charCount.set(ch, charCount.get(ch)-1);
                long numPermutation = fact.get(remaining);
                
                for (int c = 0; c < 128; c++) {
                    if (charCount.get(c) <= 1) continue; 
                    numPermutation = (numPermutation * inverseNumber(fact.get(charCount.get(c)))) % MOD;
                }
    
                charCount.set(ch, charCount.get(ch)+1);
                less = (less + numPermutation) % MOD;
            }
            
            rank = (rank + less) % MOD;
            // remove the current character from the set. 
            charCount.set((int)S.charAt(i), charCount.get(S.charAt(i))-1);
        }
        return (int)rank;

    }
    
    public static void initializeFactorials(int totalLen, ArrayList<Integer> fact) {
        
        long factorial = 1;
        fact.add(1); // 0!= 1
        for (int curIndex = 1; curIndex < totalLen; curIndex++) {
            factorial = (factorial * curIndex) % MOD;
            fact.add((int)factorial);
        }
        return;
    }
    
    public static long pow(long x, int y, int k){
        long result = 1;
        while(y > 0){
            if(y % 2 == 1) {
                result = (result * x) % k;
                y--;
            }
            y >>= 1;
            x = (x * x) % k;
        }
        return result;
    }

    static long inverseNumber(int num) {

        // Inverse modulo : https://en.wikipedia.org/wiki/Modular_multiplicative_inverse
        // Calculate num ^ MOD-2  % MOD
        return pow(num, MOD-2 , MOD);
    }
}
