package sort;

import com.jungle.ds.sort.demo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version: v1.0
 * @date: 2021/3/16
 * @author: dgj
 */
public class SortTest {
    public static void main(String[] args) {
        testSort(getSufferList(), new Bubbling());
        testSort(getSufferList(), new Inserting());
        testSort(getSufferList(), new Shelling());
        testSort(getSufferList(), new Selecting());
        testSort(getSufferList(), new Merging());
    }

    private static List<Long> getSufferList() {
        List<Long> sufferList = new ArrayList<>();
        int count = 10000;
        for (int i = 0; i < count; i++) {
            sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % (count + 1))));
        }
        return sufferList;
    }

    private static void testSort(List<Long> sufferList, Sort sort) {
        System.out.println("sufferList = " + sufferList);
        long millis = System.currentTimeMillis();
        sort.sort(sufferList);
        System.out.println("sortList = " + sufferList);
        System.out.println("Used Time :" + (System.currentTimeMillis() - millis) + "ms");
    }

}
