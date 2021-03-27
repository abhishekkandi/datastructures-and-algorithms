/*

Problem Statement: Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
Lets say N = size of the array. Then, following holds true :
All elements in the array are in the range [0, N-1]
N * N does not overflow for a signed integer

*/

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(0);
        RearrangeArray(arrayList1);
        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(2);
        arrayList2.add(0);
        arrayList2.add(1);
        arrayList2.add(5);
        arrayList2.add(3);
        RearrangeArray(arrayList2);
        System.out.println(arrayList2);
    }

    public static void RearrangeArray(ArrayList<Integer> arrayList){

        int arrayListSize = arrayList.size();

        for(int i = 0; i < arrayListSize; i++){
            arrayList.set(i, arrayList.get(i) * arrayListSize);
        }

        for(int i = 0; i < arrayListSize; i++){
            int originalCurrentItemValue = arrayList.get(i) / arrayListSize;
            int requiredItemValue = arrayList.get(originalCurrentItemValue) / arrayListSize;
            arrayList.set(i, arrayList.get(i) + requiredItemValue);
        }

        for(int i = 0; i < arrayListSize; i++){
            arrayList.set(i, arrayList.get(i) % arrayListSize);
        }
    }
}

//Explaination : 21:00 } Represents to information that it is '9' & 'PM'
//Basically to rearrange the array elements without extra array, we need a solution to remember older value after swapping
//Given a array : 3 1 2 0
//Step - 2
//Modifying the array by multiplying with size of arrayList i.e, 4 (%4 -> Range is [0,3])
//New array : 12 4 8 0
//Step - 3
//Now swap the value by linearly traversing the array,
//For every item in array in order to find the original value, we need to divide by 4
//Now swap arr[i] => arr[arr[i]]
//12 5 10 3
//Step - 4
//Modify elements in array list by taking modulus 4 (size of arrayList)
//0 1 2 3