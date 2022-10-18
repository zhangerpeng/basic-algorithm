package com.algorithm.sort.bubble;

import com.algorithm.sort.quick.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortFun() {
        int arr[] = new int[]{2,5,3,1,9,8,6};
        new BubbleSort().bubbleSortFun(arr);
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
    }
}