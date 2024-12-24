package _5_oop_._1_oop_objectArray;

public class Main {
    //객체들을 담을 수 있는 배열 - 객체를 옮기기 쉽게 하기 위해 배열사용
    public static void main(String[] args) {
        // 객체 배열 선언 및 초기화
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 90),
            new Student("Charlie", 78)
        };

        int totalScore = 0;

        // 배열 요소를 순회하며 점수 합산
        for (Student student : students) {
            totalScore += student.score;
        }

        // 결과 출력
        double averageScore = (double) totalScore / students.length;
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
    }
}
