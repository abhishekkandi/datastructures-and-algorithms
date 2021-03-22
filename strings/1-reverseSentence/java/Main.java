public class Main {

    public static void main(String[] args) {
        System.out.println(reverseWord(new char[] {'d','e','l','l'}, 0,3));
        System.out.println(reverseSetence(new char[]{'t','h','i','s',' ','i','s',' ','a','b','h','i','s','h','e','k'}));
    }

    public static char[] reverseSetence(char[] sentence)
    {
        //Input: "This is Abhishek"
        //Step 1: Reverse entire String "kehsihba si siht"
        //Step 2: Next reverse each word in reverse string (seperated by space)
        sentence = reverseWord(sentence, 0, sentence.length - 1);

        int startIndex = 0;
        for(int i = 0; i < sentence.length; i++){
            if(sentence[i] == ' '){
                reverseWord(sentence, startIndex, i - 1);//i-1 } To exclude space
                startIndex = i + 1;//Pointing to character after spacing
            }
        }

        reverseWord(sentence,startIndex,sentence.length-1);//For last word

        return sentence;
    }

    public static char[] reverseWord(char[] wordChars, int left, int right) {

        for(int i = left, j = right; i < j; i++,j--){
            char temp = wordChars[i];
            wordChars[i] = wordChars[j];
            wordChars[j] = temp;
        }

        return wordChars;
    }
}

/* 
Problem Statement: 
Given a string A of size N.
Return the string A after reversing the string word by word.

NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.

public class Solution {
    public String solve(String A) {
        char[] aChars = A.trim().replaceAll("( ){2,}"," ").toCharArray();
        aChars = reverseSetence(aChars);
        return new String(aChars);
    }
    
    public char[] reverseSetence(char[] sentence)
    {
        sentence = reverseWord(sentence, 0, sentence.length - 1);

        int startIndex = 0;
        for(int i = 0; i < sentence.length; i++){
            if(sentence[i] == ' '){
                reverseWord(sentence, startIndex, i - 1);//i-1 } To exclude space
                startIndex = i + 1;//Pointing to character after spacing
            }
        }

        reverseWord(sentence,startIndex,sentence.length-1);

        return sentence;
    }
    
    public char[] reverseWord(char[] wordChars, int left, int right) {

        for(int i = left, j = right; i < j; i++,j--){
            char temp = wordChars[i];
            wordChars[i] = wordChars[j];
            wordChars[j] = temp;
        }

        return wordChars;
    }
}

*/