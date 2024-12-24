package _6_container._4_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTest {
    public static void main(String[] args) {
        //ArrayDeque 생성
        Queue<String> deque = new ArrayDeque<>();

        //offer() 메서드로 요소 추가
        deque.offer("Apple");
        deque.offer("Banana");
        deque.offer("Cherry");
        System.out.println(deque);

        //poll() 메서드로 첫번째 요소 삭제
        deque.poll();
        System.out.println(deque);

        //peek() 메서드로 첫번째 요소 조회
        System.out.println(deque.peek());

        //남아있는 요소 출력
        System.out.println("Remaining Queue: " + deque);  // 출력: [Two, Three]
    }
}
