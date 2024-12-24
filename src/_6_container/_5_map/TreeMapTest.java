package _6_container._5_map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        // TreeMap 생성 (키는 정렬됨)
        Map<Integer, String> map = new TreeMap<>();

         // 키-값 쌍 추가
         map.put(10, "Ten");
         map.put(5, "Five");
         map.put(20, "Twenty");
 
         // Map 출력: 키가 오름차순으로 정렬됨
         System.out.println("TreeMap: " + map);  // 출력: {5=Five, 10=Ten, 20=Twenty}
    }
}
