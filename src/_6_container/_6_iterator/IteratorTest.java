package _6_container._6_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        // ArrayList 생성
        List<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);

        // Iterator 생성
        Iterator<String> iterator = list.iterator();

        // 요소 조회
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
