package com.anhnbt.exercises;

public class MergeArray {
    public static void main(String[] args) {
        int[] myArrayOne = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] myArrayTwo = {4, 5, 6, 7, 8};
        int lengthArrayOne = myArrayOne.length;
        int lengthArrayTwo = myArrayTwo.length;
        int[] mergeArray = new int[lengthArrayOne + lengthArrayTwo];

        System.out.print("Array One: ");
        for (int i = 0; i < myArrayOne.length; i++) {
            mergeArray[i] = myArrayOne[i];
            System.out.print(myArrayOne[i] + " ");
        }

        System.out.print("\nArray Two: ");
        for (int j = 0; j < myArrayTwo.length; j++) {
            mergeArray[lengthArrayOne+j] = myArrayTwo[j];
            System.out.print(myArrayOne[j] + " ");
        }
        System.out.print("\nMerge array: ");
        for (int v : mergeArray) {
            System.out.print(v + " ");
        }
    }
}
