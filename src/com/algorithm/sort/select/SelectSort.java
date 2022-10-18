package com.algorithm.sort.select;

public class SelectSort {


    private void swarpChangeEle(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 选择排序
     * 1. 从数组中挑选出最小的元素
     * 2. 将最小的元素搁置在数组的第一位
     * 3. 从剩余的元素中再次获取最小元素
     * 4.依次将剩余元素中的最小元素搁置在对应的初始位置
     *
     * @param arr
     */
    public void selectSortFun(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swarpChangeEle(arr, i, j);
                }
            }
        }
    }
}
