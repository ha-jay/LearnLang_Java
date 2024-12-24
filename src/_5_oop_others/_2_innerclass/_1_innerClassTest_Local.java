package _5_oop_others._2_innerclass;

class OuterClass3 {
    // 외부 클래스의 메서드
    void method() {
        // 지역 변수
        final String localVariable = "Local Variable";

        // 지역 내부 클래스
        class LocalInnerClass {
            void printLocalVariable() {
                System.out.println(localVariable);
            }
        }

        // 지역 내부 클래스 객체 생성
        LocalInnerClass localInner = new LocalInnerClass();
        // 지역 내부 클래스 메서드 호출
        localInner.printLocalVariable();
    }
}

public class _1_innerClassTest_Local {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.method();
    }
}