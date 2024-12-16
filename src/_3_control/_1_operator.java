package _3_control;

public class _1_operator {
    //단축평가에 사용될 static 메서드
    public static boolean isConditionMet() {
        System.out.println("This will not be printed!");
        return true;
    }
    public static void main(String[] args) {
        //단항연산자
        int k = 10;
        System.out.println(k++); // 후위연산자 : 먼저 출력 후 증가 -> 10출력후 a값 1증가
        System.out.println(++k); // 전위연산자 : 먼저 증가 후 출력 -> a값 1증가후 12출력
        //아래처럼 프로그램 연산이 끝나고 출력을 하는 경우에는 해석에 큰 차이가 없다.
        k++;
        System.out.println(k); // 13출력


        //삼항연산자
        int x = 10;
        int y = 20;
        int z = (x > y) ? x : y; // x와 y중 큰 값을 z에 할당
        System.out.println(z); // 20출력

        //이항연산자
        //산술연산자
        int a = 10;
        int b = 20;
        System.out.println(a + b); // 30출력
        System.out.println(a - b); // -10출력
        System.out.println(a * b); // 200출력
        System.out.println(a / b); // 몫 출력 - 0출력
        System.out.println(a % b); // 나머지 10출력
        //나누기연산 - 정수/정수=정수 , 실수/실수=실수, 정수/실수=실수
        System.out.println(10 / 3); // 3출력
        System.out.println(10.0 / 3.0); // 3.3333333333333335출력
        System.out.println(10 / 3.0); // 3.3333333333333335출력
        //나머지연산 - 정수%정수 = 정수 , 실수%실수= 실수!!
        System.out.println(10 % 3); // 1출력
        System.out.println(11.0 % 4.0); // 3.0출력
        //나머지연산 활용 자리수 구하기, 짝수홀수 구분, 특정숫자의 배수인지 확인
        System.out.println(123456789 % 10); // 9출력
        System.out.println(123456789 % 2); // 1출력
        System.out.println(123456789 % 3); // 0출력 -0이면 3의 배수

        //복합대입연산자  a += b means a = a + b
        int c = 10;
        c += 10; // c = c + 10;
        System.out.println(c); // 20출력
        c -= 10; // c = c - 10;
        System.out.println(c); // 10출력
        c *= 10; // c = c * 10;
        System.out.println(c); // 100출력
        c /= 10; // c = c / 10;
        System.out.println(c); // 10출력
        c %= 10; // c = c % 10;
        System.out.println(c); // 0출력

        //비교연산자
        System.out.println(a == b); // false출력
        System.out.println(a != b); // true출력
        System.out.println(a > b); // false출력
        System.out.println(a < b); // true출력
        System.out.println(a >= b); // false출력
        System.out.println(a <= b); // true출력
        //비교연산자 - 문자열비교, equals()는 문자열에서만 사용
        System.out.println("apple" == "apple"); // true출력
        System.out.println("apple" != "banana"); // true출력
        System.out.println("apple".equals("apple")); // true출력
        System.out.println("apple".equals("banana")); // false출력
        //instanceof 연산자 - 객체의 타입을 확인하는 연산자
        Number i = Integer.valueOf(10); // i는 Integer 객체 upcasting to Number
        System.out.println(i instanceof Integer); // true
        System.out.println(i instanceof Double);  // false
        
        //논리연산자 &&-and (둘다참이면 참), ||-or (둘중하나만 참이면 참), !-not (참이면 거짓, 거짓이면 참)
        System.out.println(true && true); // true출력
        System.out.println(true && false); // false출력
        System.out.println(false && true); // false출력
        System.out.println(false && false); // false출력
        System.out.println(true || true); // true출력
        System.out.println(true || false); // true출력
        System.out.println(false || true); // true출력
        System.out.println(false || false); // false출력
        System.out.println(!true); // false출력
        System.out.println(!false); // true출력
        //논리연산자 - 논리연산자는 좌항에서 우항까지 평가하면서 결과를 반환
        System.out.println(true && true || false); // true출력
        System.out.println(true && (true || false)); // true출력
        System.out.println(true || false && false); // true출력
        System.out.println((true || false) && false); // false출력
        //논리연산자 단축평가 - 좌항에서 결과가 확실하면 우항을 평가하지 않는다.
        int v = 10;
        
        if (v > 5 || isConditionMet()) {  // or조건에서 좌항이 참이므로 우항은 평가하지 않습니다.
            System.out.println("Condition is true!"); 
        }
       
        if (v < 5 && isConditionMet()) {  // and 조건에서 좌항이 거짓이므로 우항을 평가하지 않습니다.
            System.out.println("Condition is true!");
        }else{
            System.out.println("Condition is false!");
        }

       //비트연산자
       int m = 10;
       int n = 20;
       System.out.println(m & n); // 0출력
       System.out.println(m | n); // 30출력
       System.out.println(m ^ n); // 30출력
       System.out.println(~m); // -11출력
       System.out.println(m << 2); // 40출력
       System.out.println(m >> 2); // 2출력
       System.out.println(m >>> 2); // 2출력
    }   
}
