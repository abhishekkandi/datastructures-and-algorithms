import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String binarySequence = "001";
        int decimal = convertBinaryToDecimal(binarySequence);
        System.out.println("binarySequence: " + binarySequence + " decimal: " + decimal);

        int decimalInput = 5;
        String binarySequenceOutput = convertDecimalToBinary(decimalInput);
        System.out.println("decimal: " + decimalInput + " binarySequence: " + binarySequenceOutput);
    }

    private static String convertDecimalToBinary(int number){
        List<Integer> binaryNumberList = new ArrayList<Integer>();
        while(number != 0){
            binaryNumberList.add(number % 2);//110 % 2 = 0
            number /= 2;    
        }

        String binarySequence = "";
        for(int i = binaryNumberList.size() -1; i >=0; i--){
            binarySequence += binaryNumberList.get(i);
        }

        return binarySequence;
    }

    /*
        Input: "1110"
        Output: 1 * 2 pow(3) + 1 * 2 pow(2) + 1 * 2 pow(1) + 0 * 2 pow(0) 
                8 + 4 + 2 + 0 = 14
    */
    private static int convertBinaryToDecimal(String binarySequence){

        int decimal = 0;
        int binarySequenceLength = binarySequence.length();
        
        for(int i = 0, j = binarySequenceLength - 1; i < binarySequenceLength; i++, j--){
            if(binarySequence.charAt(i) == '1')
                decimal += Math.pow(2, j);
        }

        return decimal;
    }
}
