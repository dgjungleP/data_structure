package com.jungle.ds.sort.demo;

import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/16
 * @author: dgj
 */
public class Inserting extends SwapSort {
    @Override
    public void sort(List<Long> dump) {
        for (int i = 1; i < dump.size(); i++) {
            if (dump.get(i) < dump.get(i - 1)) {
                for (int j = i; j > 0; j--) {
                    if (dump.get(j) < dump.get(j - 1)) {
                        swap(dump, j, j - 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
