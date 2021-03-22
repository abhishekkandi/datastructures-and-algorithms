/*

Problem Statement : Write a recursive function that checks whether a string A is a palindrome or Not.
Return 1 if the string A is palindrome, else return 0.

Note: A palindrome is a string that's the same when reads forwards and backwards.

*/

public class Main {

    public static void main(String[] args) {
        int result1 = SumOfDigits(12345);
        System.out.println(Integer.toString(result1));;
    }

    public static int SumOfDigits(int number){
        if(number == 0)
            return 0;
        return (number % 10) + SumOfDigits(number/10);
    }
    
}