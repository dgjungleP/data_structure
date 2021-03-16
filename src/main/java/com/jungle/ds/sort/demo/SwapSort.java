package com.jungle.ds.sort.demo;

import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/16
 * @author: dgj
 */
public abstract class SwapSort implements Sort {
    public void swap(List<Long> dump, int indexPre, int indexNext) {
        Long temp = dump.get(indexPre);
        dump.set(indexPre, dump.get(indexNext));
        dump.set(indexNext, temp);
    }
}
