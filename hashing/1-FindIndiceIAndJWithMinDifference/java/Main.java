//Problem Statement : Given an array. Find indices i & j such that | i - j |  is minimum.

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int arr[] = { 2,1,4,2,6,1,4,2,3,2,4,3 };
        Answer answer =  FindMinDifferenceBetweenIAndJ(arr);
        System.out.println("answer_i: " + answer.getAnswer_i());
        System.out.println("answer_j: " + answer.getAnswer_j());
        System.out.println("min_difference: " + answer.getMin_difference());
    }

    public static Answer FindMinDifferenceBetweenIAndJ(int[] arr) {
        Answer answer = new Answer();
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();//mapping between array item & it's previous occurence

        for(int index = 0; index < arr.length; index++)
        {
            if(hash_map.containsKey(arr[index]))
            {
                int j = hash_map.get(arr[index]);
                int currentDifference = index - j;
                if(currentDifference < answer.getMin_difference())
                {
                    answer.setAnswer_i(index);
                    answer.setAnswer_j(j);
                    answer.setMin_difference(currentDifference);
                }
            }
            hash_map.put(arr[index], index);
        }

        return answer;
    }
}

class Answer {
    private int answer_i;
    private int answer_j;
    private int min_difference;

    public Answer()
    {
        answer_i = 0;
        answer_j = 0;
        min_difference = Integer.MAX_VALUE;
    }

    public int getAnswer_i() {
        return answer_i;
    }

    public void setAnswer_i(int answer_i) {
        this.answer_i = answer_i;
    }

    public int getAnswer_j() {
        return answer_j;
    }

    public void setAnswer_j(int answer_j) {
        this.answer_j = answer_j;
    }

    public int getMin_difference() {
        return min_difference;
    }

    public void setMin_difference(int min_difference) {
        this.min_difference = min_difference;
    }
}
