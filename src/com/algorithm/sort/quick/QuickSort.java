package com.algorithm.sort.quick;

public class QuickSort {


    private void swarpEle(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    /**
     * 快速排序 核心目标，每次迭代的结果，指标元素将数组济宁分割【分而治之】
     * 1.定义指标元素
     * 2.定义头尾指针i，j
     * 3.当指针i !=j,时，首先移动j指针
     * 3.1(若 arr[j])> 指标元素】j--，
     * 3.2(arr[j]<=指标元素)，移动i 指针，i++
     * 3.3(arr[i]>指标元素) 交换 i ,与 j 所在元素的值
     * 4. i = j 时，此时对调指标元素与此时i，j所在位置的元素，此时 数组以指标元素为中心，切分为2
     * 5.切分后的数组，再次进行递归
     *
     * @param arr
     * @param start
     * @param end
     */
    public void quickSortFun(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int p = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (p <= arr[j] ) {
                j--;
            }
            while (p >= arr[i]) {
                i++;
            }

            swarpEle(arr, i, j);
        }
        swarpEle(arr,start,i);
        quickSortFun(arr, start, j - 1);
        quickSortFun(arr, j + 1, end);
    }
}
