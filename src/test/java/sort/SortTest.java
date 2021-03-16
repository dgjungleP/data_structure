package sort;

import com.jungle.ds.sort.demo.Bubbling;
import com.jungle.ds.sort.demo.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: v1.0
 * @date: 2021/3/16
 * @author: dgj
 */
public class SortTest {
    public static void main(String[] args) {
        List<Long> sufferList = new ArrayList<>();
        sufferList.add(1L);
        sufferList.add(7L);
        sufferList.add(3L);
        sufferList.add(5L);
        sufferList.add(5L);
        sufferList.add(2L);
        testSort(sufferList, new Bubbling());
    }

    private static void testSort(List<Long> sufferList, Sort sort) {
        sort.sort(sufferList);
        System.out.println("sufferList = " + sufferList);
    }
}
