package com.jungle.ds.sort.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/18
 * @author: dgj
 */
public class Merging implements Sort {
    @Override
    public void sort(List<Long> dump) {

        List<Long> results = divide(dump);
        dump.clear();
        dump.addAll(results);
    }

    private List<Long> divide(List<Long> dump) {
        int count = dump.size();
        if (count < 2) {
            return dump;
        }
        return merge(divide(dump.subList(0, count / 2)), divide(dump.subList(count / 2, count)));
    }

    private List<Long> merge(List<Long> dumpLeft, List<Long> dumpRight) {
        List<Long> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < dumpLeft.size() && rightIndex < dumpRight.size()) {
            if (dumpLeft.get(leftIndex) < dumpRight.get(rightIndex)) {
                result.add(dumpLeft.get(leftIndex));
                leftIndex++;
            } else {
                result.add(dumpRight.get(rightIndex));
                rightIndex++;
            }
        }
        if (rightIndex == dumpRight.size()) {
            result.addAll(dumpLeft.subList(leftIndex, dumpLeft.size()));
        }
        if (leftIndex == dumpLeft.size()) {
            result.addAll(dumpRight.subList(rightIndex, dumpRight.size()));
        }
        return result;
    }
}
