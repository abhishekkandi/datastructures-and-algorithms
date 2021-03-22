/*
Write a recursive function that checks whether a string A is a palindrome or Not.
Return 1 if the string A is palindrome, else return 0.

Note: A palindrome is a string that's the same when reads forwards and backwards.
*/

public class Main {

    public static void main(String[] args) {
        String word = "naman";
        System.out.println(isPalindrome(word, 0, word.length()));
    }

    public static boolean isPalindrome(String word, int left, int right){

        if(word.charAt(left) != word.charAt(right))//Base conditions
            return false;

        if(left == right || left > right)//Base conditions
            return  true;

        return isPalindrome(word, left + 1, right - 1);//recurence relation
    }
}