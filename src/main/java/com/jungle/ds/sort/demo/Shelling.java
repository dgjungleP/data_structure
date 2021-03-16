package com.jungle.ds.sort.demo;

import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/16
 * @author: dgj
 */
public class Shelling extends SwapSort {
    @Override
    public void sort(List<Long> dump) {
        int offset = dump.size();
        while ((offset /= 2) != 0) {
            for (int i = 0; i < offset; i++) {
                for (int j = i + offset; j < dump.size(); j += offset) {
                    if (dump.get(j-offset) > dump.get(j)) {
                        for (int k = j-offset; k >= 0; k -= offset) {
                            if (dump.get(k) > dump.get(j)) {
                                swap(dump, k, j);
                            } else{
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
