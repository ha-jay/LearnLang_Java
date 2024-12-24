package _2_datatype;

//제네릭 인터페이스 예시
interface Pair<K, V> {
    K getKey();
    V getValue();
}

class MyPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public MyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

public class _5_generic_interface {
    public static void main(String[] args) {
        // Key는 String, Value는 Integer인 Pair 생성
        Pair<String, Integer> pair = new MyPair<>("Age", 25);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}

