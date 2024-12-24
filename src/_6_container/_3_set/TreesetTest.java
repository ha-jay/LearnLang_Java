package _6_container._3_set;

import java.util.TreeSet;

public class TreesetTest {
    public static void main(String[] args) {
        //TreeSet 생성
        TreeSet<String> set = new TreeSet<>();

        //요소 추가// 요소 추가
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        System.out.println(set); //(자동으로 알파벳 순으로 정렬됨)

        //first() 메서드로 첫번째 요소 조회
        System.out.println(set.first());

        //last() 메서드로 마지막 요소 조회
        System.out.println(set.last());
    }
}
