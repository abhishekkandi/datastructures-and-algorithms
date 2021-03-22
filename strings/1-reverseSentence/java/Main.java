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