package _10_io_file._0_standardIO;

import java.util.Scanner;

public class StandardIOScannerTest {
    public static void main(String[] args) {
        // 표준 입력
         // Scanner 객체 생성
         Scanner scanner = new Scanner(System.in);

         // 사용자에게 메시지 출력
         System.out.print("이름을 입력하세요: ");
         String name = scanner.nextLine(); // 문자열 입력 받기
 
         System.out.print("나이를 입력하세요: ");
         int age = scanner.nextInt(); // 정수 입력 받기
 
         // 결과 출력
         System.out.println("안녕하세요, " + name + "님! 나이는 " + age + "살입니다.");
 
         // Scanner 객체 닫기
         scanner.close();
       


        //scanner method
        // next() : 공백 전까지 문자열을 읽는다.
        // nextLine() : 한 줄을 읽는다.
        // nextInt() : 정수를 읽는다.
        // nextDouble() : 실수를 읽는다.
        // nextBoolean() : 논리값을 읽는다.
        // nextByte() : 바이트를 읽는다.
        // nextShort() : 짧은 정수를 읽는다.
        // nextLong() : 긴 정수를 읽는다.
        // nextFloat() : 부동 소수점을 읽는다.

    }   
}
