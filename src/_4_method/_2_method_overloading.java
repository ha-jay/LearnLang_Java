package _4_method;

public class _2_method_overloading {
     // 메서드 오버로딩 - 같은이름이나 parameter를 다르게 하여 작동시킴. 컴파일러가 구분해줌.
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    static public void main(String[] args) {
        _2_method_overloading obj = new _2_method_overloading();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1.0, 2.0));
    }
}
