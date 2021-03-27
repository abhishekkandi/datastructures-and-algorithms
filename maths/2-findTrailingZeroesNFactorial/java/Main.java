/*

Given an integer A, return the number of trailing zeroes in A! i.e. factorial of A.
Note: Your solution should run in logarithmic time complexity.

*/

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        System.out.println(Integer.toString(findTrailingZeroes(100)));
    }

    public static int findTrailingZeroes(int N){

        int trailingZeroes = 0;
        for(int i = 5; N/i > 0; i *= 5){
            trailingZeroes += N/i;
        }
        return trailingZeroes;
    }
}

//Explaination : No of trailing depends on number of (2,5) pairs
//5 repeats majorly
//5    25(Contributes 2 fives) 125(Three 5's)
//N/5 + N/125 + N/625....