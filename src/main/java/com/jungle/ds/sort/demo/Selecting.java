package com.jungle.ds.sort.demo;

import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/18
 * @author: dgj
 */
public class Selecting extends SwapSort {
    @Override
    public void sort(List<Long> dump) {
        for (int i = 0; i < dump.size() - 1; i++) {
            int minIndex = i;
            Long min = dump.get(minIndex);
            for (int j = i + 1; j < dump.size(); j++) {
                if (dump.get(j) < min) {
                    minIndex = j;
                    min = dump.get(j);
                }
            }
            if (minIndex != i) {
                swap(dump, i, minIndex);
            }
        }
    }
}
