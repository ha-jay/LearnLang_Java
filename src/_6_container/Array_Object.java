package _6_container;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
public class Array_Object {
    public static void main(String[] args) {
        //객체 배열 선언
        //객체배열에는 기본적으로 null값이 들어가 있음, 배열에값을 할당해야 실제 객체 사용가능합니다.
        Person[] people = new Person[3];
        
        //객체 배열 초기화
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);

        //객체 배열 출력
        for (Person person : people) {
            person.introduce();
        }

        //동적배열 사용 (ArrayList)
        //ArrayList는 크기가 유동적인 배열처럼 사용할 수 있음   
        //동적 배열 크기 조정이 필요하다면 ArrayList와 같은 컬렉션을 사용하는 것이 더 적합
        List<Person> people2 = new ArrayList<>();
        people2.add(new Person("Alice", 25));
        people2.add(new Person("Bob", 30));
        people2.add(new Person("Charlie", 35));

        //동적배열 출력
        for (Person person : people2) {
            person.introduce();
        }
    }
}
