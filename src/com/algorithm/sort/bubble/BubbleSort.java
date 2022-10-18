package com.algorithm.sort.bubble;

public class BubbleSort {

    private void swarpEle(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 最大元素依次位于最后面
     *
     * @param arr
     */
    public void bubbleSortFun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swarpEle(arr,j,j+1);
                }
            }
        }
    }
}
