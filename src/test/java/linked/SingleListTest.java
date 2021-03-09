package linked;


import com.jungle.ds.linked.demo.SinglyList;

/**
 * @version: v1.0
 * @date: 2021/3/9
 * @author: dgj
 */
public class SingleListTest {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        System.out.println("list.getSize() = " + list.getSize());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list.getSize() = " + list.getSize());
        list.remove(2);
        System.out.println("list.getSize() = " + list.getSize());
        list.set(1, 5);
        System.out.println("list = " + list);
    }
}
