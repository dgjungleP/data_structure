package sort;

import com.jungle.ds.sort.demo.Bubbling;
import com.jungle.ds.sort.demo.Inserting;
import com.jungle.ds.sort.demo.Shelling;
import com.jungle.ds.sort.demo.Sort;

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
    }

    private static List<Long> getSufferList() {
        List<Long> sufferList = new ArrayList<>();
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        sufferList.add((long) new Random().nextInt(Math.toIntExact(System.currentTimeMillis() % 100)));
        return sufferList;
    }

    private static void testSort(List<Long> sufferList, Sort sort) {
        System.out.println("sufferList = " + sufferList);
        sort.sort(sufferList);
        System.out.println("sortList = " + sufferList);
    }

}
