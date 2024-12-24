package _5_oop_others._2_innerclass;

//외부 클래스
class OuterClass {
    //외부 클래스의 인스턴스 변수
    private String outerField = "Outer Field";

    //내부 클래스 - 외부 클래스의 인스턴스 변수에 접근할 수 있습니다.
    class InnerClass {
        void printOuterField() {
            System.out.println("Outer field: " + outerField);//외부 클래스의 인스턴스 변수에 접근
        }
    }
    //외부클래스 메서드 - 내부클래스를 생성하고 내부 메서드를 호출합니다.
    void createInnerClass() {
        InnerClass inner = new InnerClass();  // 내부 클래스의 객체 생성
        inner.printOuterField();
    }
}

public class _1_InnerClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerClass();
    }
}
