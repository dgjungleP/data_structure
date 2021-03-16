package com.jungle.ds.sort.demo;

import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/16
 * @author: dgj
 */
public class Bubbling implements Sort {

    @Override
    public void sort(List<Long> dump) {
        for (int i = 0; i < dump.size(); i++) {
            for (int j = 0; j < dump.size(); j++) {
                if (dump.get(i) < dump.get(j)) {
                    Long temp = dump.get(i);
                    dump.set(i, dump.get(j));
                    dump.set(j, temp);
                }
            }
        }
    }
}
