package _8_lamda;

@FunctionalInterface
//람다식을 사용하는 인터페이스로 내부에는 추상메서드가 하나만 있어야 한다.
interface StringFunction {
    String run(String str);//추상메서드 리턴타입 String, 매개변수 String 함수명 run
}

public class _2_lamdaTestInterface {
    //람다식을 사용하는 메서드 생성
    public static void printFormatted(String str, StringFunction format) { //StringFunction 인터페이스를 구현한 람다식을 매개변수로 받는다.
        String result = format.run(str);//StringFunction 인터페이스를 구현한 람다식을 호출하여 String변수 result에 저장
        System.out.println(result);//result 출력
    }

    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!"; //StringFunction 인터페이스를 구현한 람다식을 생성, 함수명 exclaim, 매개변수 s, 리턴타입 String, 구현부 매개변수로 들어온 string에 "!"을 추가하여 리턴
        StringFunction ask = (s) -> s + "?"; //StringFunction 인터페이스를 구현한 람다식을 생성, 함수명 ask, 매개변수 s, 리턴타입 String, 구현부 매개변수로 들어온 string에 "?"을 추가하여 리턴
        printFormatted("Hello", exclaim); //printFormatted 메서드 호출, 매개변수 "Hello", exclaim 람다식 전달
        printFormatted("Hello", ask); //printFormatted 메서드 호출, 매개변수 "Hello", ask 람다식 전달
    }
}
