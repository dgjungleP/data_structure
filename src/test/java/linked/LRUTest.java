package linked;

import com.jungle.ds.linked.demo.LRUEliminationAlg;

/**
 * @version: v1.0
 * @date: 2021/3/10
 * @author: dgj
 */
public class LRUTest {

    public static void main(String[] args) {
        LRUEliminationAlg cache = new LRUEliminationAlg(5);

        Integer hello = cache.get("1");
        cache.put("1", 1);
        cache.put("2", 2);
        cache.put("3", 3);
        cache.put("4", 4);
        cache.put("5", 5);
        cache.put("6", 6);
    }
}
