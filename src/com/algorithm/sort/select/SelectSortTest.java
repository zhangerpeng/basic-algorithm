package com.algorithm.sort.select;


import org.junit.Test;

import java.util.Arrays;

public class SelectSortTest {

    @Test
    public void selectSortFunTest() {
        int arr[] = new int[]{2,5,3,1,9,8,6};
        new SelectSort().selectSortFun(arr);
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));

    }
}