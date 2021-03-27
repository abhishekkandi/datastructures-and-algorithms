//Problem Statement: Given a column title as appears in an Excel sheet, return its corresponding column number.

public class Main{
    public static void main(String[] args) {
        System.out.println(Integer.toString(findExcelColumnNumber("ABCD")));//Output : 19010
    }

    public static int findExcelColumnNumber(String A) {
        int columnNumber = 0;
        for(int i = 0, power = A.length() - 1; i < A.length(); i++, power--){
            int asciiValue = A.charAt(i);
            int alphabetRank = asciiValue - 64;
            columnNumber += alphabetRank * Math.pow(26,power);
        }

        //ABCD -> Alphabet base - 26..A(3) B(2) C(1) D(0)
        //A,B,C,D alphabet ranks -> 1,2,3,4
        //1 * 26 power(3) + 2 * 26 power(2) + 3 * power(3) + 4 * power(4)

        return columnNumber;
    }
}