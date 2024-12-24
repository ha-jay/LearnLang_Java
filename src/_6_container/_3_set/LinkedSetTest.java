package _6_container._3_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetTest {
    public static void main(String[] args) {
        //LinkedHashSet 생성
        Set<String> set = new LinkedHashSet<>();

        //요소 추가
        set.add("A");
        set.add("K");
        set.add("C");
        set.add("K"); // 중복된 요소는 추가되지 않음
        System.out.println(set);
    }
}
