package _1_variable;

public class _2_var_scope_local {
    //method
    public void exampleMethod() {
        int localVar = 10; // 로컬 변수
        System.out.println(localVar);
    }
    public static void main(String[] args) {
        _2_var_scope_local obj = new _2_var_scope_local(); // 객체 생성
        //클래스객체를 생성하지않고 내부메서드를 static 메소드인 main에서 직접호출하려고 하면 에러가 발생한다. 
        //왜냐하면 메서드는 객체의 인스턴스 메서드이기 때문이다.

        obj.exampleMethod(); // 객체를 통해 메소드 호출
    }
}
