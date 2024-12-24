package _6_container._1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    //모든 컬렉션 클래스는 Collection 인터페이스를 구현한다.
    //그러므로 모든 클래스에서 공통으로 사용가능한 메서드를 알아보자.

    public static void main(String[] args) {
       // Collection 생성
        Collection<String> collection = new ArrayList<>();
          // 요소 추가
          collection.add("Apple");
          collection.add("Banana");
          collection.add("Cherry"); 
          // 요소 출력
          System.out.println(collection);

           // 크기 확인
        System.out.println("Size: " + collection.size());  // 출력: Size: 3

        // 비어있는지 확인
        System.out.println("isEmpty: " + collection.isEmpty());  // 출력: isEmpty: false    

        // 요소 포함 여부 확인
        System.out.println("Contains 'Banana': " + collection.contains("Banana"));  // 출력: Contains 'Banana': true

        // 요소 제거
        collection.remove("Banana");
        System.out.println(collection);  // 출력: [Apple, Cherry]   

         // 컬렉션의 모든 요소 출력
         for (String item : collection) {
            System.out.println(item);
        }

        // 모든 요소 제거
        collection.clear();
        System.out.println(collection);  // 출력: []

        // 비어있는지 확인
        System.out.println("isEmpty: " + collection.isEmpty());  // 출력: isEmpty: true

       
    }   
}   
