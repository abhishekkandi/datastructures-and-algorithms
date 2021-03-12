//Problem Statement : Given an array. Return true when any i != j != p != q & A[i] + A[j] = A[p] + A[q]

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int arr[] = { 7,2,3,8,1,4,5,6 };
        System.out.print(CheckUniqueIJPQIndicesPairWithEqualSum(arr));
    }

    public static boolean CheckUniqueIJPQIndicesPairWithEqualSum(int[] arr) {
        HashMap<Integer, IndexPair> hashMap = new HashMap<Integer, IndexPair>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if(hashMap.containsKey(sum)){
                    if(hashMap.get(sum).getIndex1() != i && hashMap.get(sum).getIndex2() != j){
                        return true;
                    }
                }
                IndexPair indexPair = new IndexPair();
                indexPair.setIndex1(i);
                indexPair.setIndex2(j);
                hashMap.put(sum, indexPair);
            }
        }

        return false;
    }
}

class IndexPair
{
    private int Index1;
    private int Index2;

    public int getIndex1() {
        return Index1;
    }

    public void setIndex1(int index1) {
        Index1 = index1;
    }

    public int getIndex2() {
        return Index2;
    }

    public void setIndex2(int index2) {
        Index2 = index2;
    }
}