package Recursion;

import java.util.Arrays;

public class SumTrianglefromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr);
    }

    static void print(int[] arr){

        if(arr.length < 1){
            return;
        }

        int[] temp = new int[arr.length-1];
        for(int i = 0;i<arr.length-1;i++){
            temp[i] = arr[i]+arr[i+1];
        }
        print(temp);
        System.out.print(Arrays.toString(arr)+"\n");
    }
}
