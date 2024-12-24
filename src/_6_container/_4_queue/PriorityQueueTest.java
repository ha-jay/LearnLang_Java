package _6_container._4_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        //PriorityQueue 생성 - (기본적으로 최소 힙 방식)
        Queue<Integer> pq  = new PriorityQueue<>();

        //offer() 메서드로 요소 추가
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq );

        // 우선순위 큐에서 요소 제거 (우선순위가 높은 요소가 먼저 나옴)
        System.out.println("Removed: " + pq.poll());  // 출력: 10 (가장 작은 값이 우선)
        System.out.println("Removed: " + pq.poll());  // 출력: 20

        // 큐에 남아있는 요소 출력
        System.out.println("Remaining PriorityQueue: " + pq);  // 출력: [30]

        // 큐의 크기 확인
        System.out.println("PriorityQueue size: " + pq.size());  // 출력: 1
    }
}
