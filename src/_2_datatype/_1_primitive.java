package _2_datatype;

public class _1_primitive {
    public static void main(String[] args) {
        // 1. 기본 자료형 변수 선언
        int age = 25;                // 정수형 변수
        double weight = 70.5;        // 실수형 변수
        char grade = 'A';            // 문자형 변수
        boolean isStudent = true;    // 불린형 변수
        long distance = 1500000000L; // long형 변수 (큰 정수)
        float pi = 3.14f;            // float형 변수 (실수)
        byte b = 127;                // byte형 변수 (작은 정수)
        short temperature = 30;      // short형 변수 (정수)

        // 2. 변수 값 출력
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Distance: " + distance);
        System.out.println("Pi: " + pi);
        System.out.println("Byte: " + b);
        System.out.println("Temperature: " + temperature);

        // 3. 기본 자료형 계산
        int sum = age + 5; // 나이에 5 더하기
        double newWeight = weight * 1.1; // 체중에 10% 증가
        boolean passed = grade == 'A'; // 성적이 A인지 체크

        // 4. 결과 출력
        System.out.println("Age + 5: " + sum);
        System.out.println("New Weight (after 10% increase): " + newWeight);
        System.out.println("Is the grade A? " + passed);
    }
}
