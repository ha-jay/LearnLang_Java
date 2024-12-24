package _5_oop_._3_poly_Object;

public class MainObjectArray {
    public static void main(String[] args) {
        // Object 타입의 배열 생성
        Object[] objects = new Object[4];

        // 배열에 다양한 타입의 객체 저장
        objects[0] = "Java";
        objects[1] = 100;
        objects[2] = 45.67;
        objects[3] = new MainObjectArray();

        // 배열을 순회하며 객체의 정보를 출력
        for (Object obj : objects) {
            if (obj instanceof String) {
                System.out.println("String: " + obj);
            } else if (obj instanceof Integer) {
                System.out.println("Integer: " + obj);
            } else if (obj instanceof Double) {
                System.out.println("Double: " + obj);
            } else {
                System.out.println("Object: " + obj);
            }
        }
    }
}
