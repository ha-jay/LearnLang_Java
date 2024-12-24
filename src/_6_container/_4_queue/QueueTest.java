package _6_container._4_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //Queue 생성
        Queue<String> queue = new LinkedList<>();

         // add() 메서드로 요소 추가, 용량초과시 IllegalStateException 발생
         queue.add("Apple");
         queue.add("Banana");
         queue.add("Cherry");
         System.out.println(queue);

         //offer() 메서드로 요소 추가, 용량초과시 false 반환
         queue.offer("Apple");
         queue.offer("Banana");
         queue.offer("Cherry");
         System.out.println(queue);

         //remove() 메서드로 요소 삭제, 요소가 없으면 NoSuchElementException 발생
         queue.remove();// 첫번째 요소 삭제
         queue.remove("Banana"); // 지정된 요소 삭제
         System.out.println(queue);

         //poll() 메서드로 첫번째 요소 삭제, 요소가 없으면 null 반환
         queue.poll();
         System.out.println(queue);

         //element() 메서드로 첫번째 요소 조회, 요소가 없으면 NoSuchElementException 발생
         System.out.println(queue.element());

         //peek() 메서드로 첫번째 요소 조회, 요소가 없으면 null 반환
         System.out.println(queue.peek());

         //isEmpty() 메서드로 요소 존재 여부 확인
         System.out.println(queue.isEmpty());

         //size() 메서드로 요소 개수 조회
         System.out.println(queue.size());

         //clear() 메서드로 모든 요소 삭제
         queue.clear();
         System.out.println(queue);

    }
}

