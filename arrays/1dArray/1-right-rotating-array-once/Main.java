package com.abhishek;

//Problem Statement : Print array after it is right rotated once

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        System.out.println(Arrays.toString(rotateArrayToRightOnce(arr)));
    }

    public static int[] rotateArrayToRightOnce(int[] arr) {
        int last = arr[arr.length - 1];
        for(int i = arr.length - 1; i >= 1;  i--)
            arr[i] = arr[i-1];
        arr[0] = last;
        return arr;
    }
}
