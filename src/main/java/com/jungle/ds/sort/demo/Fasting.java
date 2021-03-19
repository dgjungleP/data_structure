package com.jungle.ds.sort.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/19
 * @author: dgj
 */
public class Fasting extends SwapSort {
    @Override
    public void sort(List<Long> dump) {
        Long[] array = dump.toArray(new Long[0]);
        array = sort(array, 0, dump.size() - 1);
        dump.clear();
        dump.addAll(Arrays.asList(array));
    }

    private Long[] sort(Long[] array, int start, int end) {
        Long pivot = array[start];
        int left = start;
        int right = end;
        while (left < right) {
            while ((left < right) && array[left] < pivot) {
                left++;
            }
            while ((left < right) && array[right] > pivot) {
                right--;
            }
            if ((array[left].equals(array[right])) && (left < right)) {
                left++;
            } else {
                Long temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        if (left - 1 > start) {
            array = sort(array, start, left - 1);
        }
        if (right + 1 < end) {
            array = sort(array, right + 1, end);
        }
        return array;
    }
}
