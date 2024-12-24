package _6_container._5_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        // LinkedHashMap 생성
        Map<String, String> map = new LinkedHashMap<>();

        // 키-값 쌍 추가
        map.put("A", "First");
        map.put("B", "Second");
        map.put("C", "Third");
        System.out.println(map);

         // Map 출력: 삽입된 순서대로 출력
         System.out.println("LinkedHashMap: " + map);  // 출력: {A=First, B=Second, C=Third}
    }
}
