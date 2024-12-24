package _6_container._5_map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
    public static void main(String[] args) {
        // Hashtable 생성
        Map<String, String> map = new Hashtable<>();

        // 키-값 쌍 추가
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");
        System.out.println(map);

         // 값 조회
         System.out.println("Key1: " + map.get("Key1"));  // 출력: Value1

         // Map 출력
         System.out.println("Hashtable contents: " + map);
    }
}
