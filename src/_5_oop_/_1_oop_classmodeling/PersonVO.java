package _5_oop_._1_oop_classmodeling;

//DTO CLASS - 데이터를 저장하고 전달하는 데이터 타입
public class PersonVO {
    //정보은닉을 위해 - private 사용 - 클래스 외부에서 접근 막는다.
    private String name;
    private int age;
    private String address;

    //생성자 - 객체 초기화
    public PersonVO(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
   
    //getter, setter 메서드 정의 - 메소드를 통해서 정보에 접근하도록 함.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }   

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //toString 메서드 정의 - 객체의 문자열 표현 반환
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
    }


}