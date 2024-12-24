package _4_method;

public class _4_method_varargs {
    //가변인자 - 여러개의 인자 받을 수 있도록 , 여러 인자는 배열로 받아진다. 
    public void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        _4_method_varargs obj = new _4_method_varargs();
        obj.printNumbers(1, 2, 3, 4, 5);
    }
}
