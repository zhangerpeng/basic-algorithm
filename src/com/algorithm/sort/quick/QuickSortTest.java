package com.algorithm.sort.quick;

import com.algorithm.sort.select.SelectSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSortFun() {
        int arr[] = new int[]{2,5,3,1,9,8,6};
        new QuickSort().quickSortFun(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
    }
}