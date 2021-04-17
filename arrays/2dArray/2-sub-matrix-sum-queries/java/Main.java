//Start Array
// import java.util.Arrays;

// public class Main{
//     public static void main(String[] args) {
//         System.out.println(Arrays.toString(findSubMatrixSumQueries(
//                 new int[][] { {1,2,3},{4,5,6},{7,8,9} },
//                 new int[] { 1,2 },
//                 new int[] { 1,2 },
//                 new int[] { 2,3 },
//                 new int[] { 2,3 }
//         )));
//     }

//     public static int[] findSubMatrixSumQueries(int[][] A, int[] B, int[] C, int[] D, int[] E) {

//         int[] output = new int[] { 0, 0 };

//         computePrefixSum(A);

//         //Compute Query B,C
//         output[0] = computeQuery(A,B,C);

//         //Compute QueryC,D
//         output[1] = computeQuery(A,D,E);

//         return output;
//     }

//     public static int computeQuery(int[][] A, int[] B, int[] C){

//         int row1 = B[0] - 1, col1 = C[0] - 1;
//         int row2 = B[1] - 1, col2 = C[1] - 1;

//         int result = A[row2][col2];

//         if(row1 <= 0)
//             result -= A[0][col2];
//         else
//             result -= A[row1-1][col2];

//         if(col1 <= 0)
//             result -=A[row2][0];
//         else
//             result -= A[row2][col1-1];

//         if(row1 <= 0)
//             result += A[0][col1];
//         else
//             result += A[row1-1][col1];

//         return result;
//     }

//     public static void computePrefixSum(int[][] A){
//         //Compute Prefix sum of first row
//         for(int i = 0, j = 1; j < A[i].length; j++)//A[i].length -> Columns
//             A[i][j] += A[i][j-1];

//         //Compute Prefix sum of first column
//         for(int i = 1, j = 0; i < A.length; i++)//A.lenth -> Rows
//             A[i][j] += A[i-1][j];

//         for(int i = 1; i < A.length; i++)
//             for(int j = 1; j < A[i].length; j++)
//                 A[i][j] = A[i-1][j] + A[i][j-1] + A[i][j] - A[i-1][j-1];
//     }
// }

//Explaination : No of trailing depends on number of (2,5) pairs
//5 repeats majorly
//5    25(Contributes 2 fives) 125(Three 5's)
//N/5 + N/125 + N/625....

/*
Problem Statement
Given a matrix of integers A of size N x M and multiple queries Q, for each query find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom and columns are numbered from left to right.
Sum may be large so return the answer mod 109 + 7.

Constraints
1 <= N, M <= 1000
-100000 <= A[i] <= 100000
1 <= Q <= 100000
1 <= B[i] <= D[i] <= N
1 <= C[i] <= E[i] <= M

Input format 
The first argument given is the integer matrix A.
The second argument given is the integer array B.
The third argument given is the integer array C.
The fourth argument given is the integer array D.
The fifth argument given is the integer array E.
(B[i], C[i]) represents the top left corner of the i'th query.
(D[i], E[i]) represents the bottom right corner of the i'th query.

Output Format
Return an integer array containing the submatrix sum for each query.

*/