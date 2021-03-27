//Not working - Index out of range (even/odd number of items in array case)
// import java.util.Arrays;

// public class Main{
//     public static void main(String[] args) {
//         System.out.println(Arrays.toString(RotateArrayKTimes(new int[]{ 1,2,3,4,5,6,7 },3)));
//     }

//     public static int[] RotateArrayKTimes(int[] numbers, int k){
//         if(k > numbers.length)
//             k %= numbers.length;//if k is more than length reducing it

//         int[] newArray = new int[numbers.length];

//         int j = 0;
//         for(int i = (numbers.length - k); i < numbers.length; i++){
//             newArray[j] = numbers[i];
//             j++;
//         }

//         for (int i = 0; i <= k; i++){
//             newArray[j] = numbers[i];
//             j++;
//         }

//         return newArray;
//     }
// }