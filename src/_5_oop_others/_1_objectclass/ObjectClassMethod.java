package _5_oop_others._1_objectclass;
class Person implements Cloneable{
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //toString 메서드 오버라이딩
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    protected void finalize() {
        System.out.println("Resource is being finalized.");
    }

}


class SharedResource {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producing...");
        wait(); // 대기 상태로 전환
        System.out.println("Resumed after notification.");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify(); // 대기 중인 스레드 깨우기
    }
}

public class ObjectClassMethod {
    public static void main(String[] args) {
        //toString 메서드 오버라이딩안하면 객체주소 출력
        ObjectClassMethod obj = new ObjectClassMethod();
        System.out.println(obj.toString()); // _5_oop_others._1_objectclass._5_oop_others._1_objectclass.ObjectClassMethod@1b6d3586
      

        //toString 메서드 오버라이딩
        Person person = new Person("Alice", 30);
        System.out.println(person.toString()); // Person{name='Alice', age=30}

        //equals 메서드 - 기본 구현은 두 객체의 참조비교입니다. (메모리 주소비교)
        //equals 메서드 재정의하여 객체의 필드 값을 기준으로 비교할 수 있습니다.
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        System.out.println(person1.equals(person2)); // false
        System.out.println(person1==person2); // false

        //hashCode 메서드 - 객체의 해시코드를 반환합니다.
        //hashCode 메서드 재정의하여 객체를 해시기반 컬렉션에서 사용할때 일관성을 유지해야합니다. 
        System.out.println(person1.hashCode()); // 531885035
        System.out.println(person2.hashCode()); // 1418481495

        //getClass 메서드 - 객체의 클래스 정보를 반환합니다. - 객체의 런타임 타입을 확인할 때 유용
        System.out.println(person1.getClass()); // class _5_oop_others._1_objectclass.Person
        System.out.println(person2.getClass()); // class _5_oop_others._1_objectclass.Person
        String str = "Hello, World!";
        System.out.println(str.getClass()); // class java.lang.String

        //clone 메서드 - 객체의 복제본을 반환합니다. - 객체를 복제할 때 유용 (기본구현은 얕은 복사를 수행)
        //사용하려면 클래스가 Cloneable 인터페이스를 구현해야 합니다.
        //clone 메서드 재정의하여 깊은 복사를 수행할 수 있습니다.
        try {
            Person person3 = (Person) person1.clone();
            System.out.println(person3); // Person{name='Alice', age=30}
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        //finalize 메서드 - 객체가 가비지 컬렉션에 의해 파괴되기 전에 호출됩니다.
        //finalize 메서드 재정의하여 객체가 파괴되기 전에 추가적인 자원해제 작업을 수행할 수 있습니다.
        //Java 9 이후로는 비권장(deprecated) 상태입니다.
        person1 = null;
        System.gc(); // 가비지 컬렉션 실행

        //wait() / notify() / notifyAll()
        //스레드 동기화를 위해 사용됩니다.
        //wait() 메서드는 현재 스레드를 대기상태로 전환하고, notify() 메서드는 대기상태에 있는 스레드를 깨웁니다.
        //notifyAll() 메서드는 대기상태에 있는 모든 스레드를 깨웁니다.
        //이 메서드들은 스레드 동기화를 위해 사용되며, 스레드 안전성을 보장하는 데 필요합니다.

        SharedResource resource = new SharedResource();

        new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(resource::consume).start();
    }

}

