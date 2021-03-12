//Problem Statement : Print a given matrix in spiral form

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
        System.out.println(Arrays.toString(spiralOrder(arr)));
    }

    public static int[] spiralOrder(int[][] arr) {
        int totalRows = arr.length;
        int totalColumns = arr[0].length;
        int[] result = new int[totalRows * totalColumns];
        int left = 0, right = totalColumns - 1, top = 0, bottom = totalRows - 1, i = 0;

        while (left <= right && top <= bottom) {
           for(int k = left; k <= right; k++){
                result[i] = arr[top][k];
                i++;
           }
           top++;

           for(int k = top; k <= bottom; k++){
               result[i] = arr[k][right];
               i++;
           }
           right--;

           for(int k = right; k >= left; k--){
               result[i] = arr[bottom][k];
               i++;
           }
           bottom--;

           for(int k = bottom; k >= top; k--)
           {
               result[i] = arr[k][left];
               i++;
           }
           left++;
        }

        return result;
    }
}
