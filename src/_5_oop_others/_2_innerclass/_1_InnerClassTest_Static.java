package _5_oop_others._2_innerclass;

//외부 클래스
class OuterClass2 {
    //외부 클래스의 정적 변수
    private static String staticField = "Static Field";

    //정적 내부 클래스 - 스태틱으로 선언된 내부클래스는 바깥 클래스의 인스턴스 생성과 관계없이 사용할 수 있습니다.
    //정적 내부 클래스는 외부 클래스의 인스턴스 변수나 메서드에 접근할 수 없습니다.
    static class StaticInnerClass {
        void printStaticField() {
            System.out.println("Static field: " + staticField);
        }
    }
}

public class _1_InnerClassTest_Static {
    public static void main(String[] args) {
        OuterClass2.StaticInnerClass inner = new OuterClass2.StaticInnerClass();
        inner.printStaticField();  // Static 내부 클래스에서 외부 클래스의 static 변수 접근
    }
}
