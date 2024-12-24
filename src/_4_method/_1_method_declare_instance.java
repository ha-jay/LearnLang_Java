package _4_method;

public class _1_method_declare_instance {
    // 메서드 선언
    public String returnString() { //접근제한자, 반환타입, 메서드이름
        String str = "Hello, World!";
        return str; //반환값
    }
    // 메서드 호출
    public static void main(String[] args) {
        _1_method_declare_instance obj = new _1_method_declare_instance(); //객체 생성
        String result = obj.returnString(); //메서드 호출
        System.out.println(result); //반환값 출력
    }
}
