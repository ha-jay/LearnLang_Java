package _5_oop_._4_abstract_class;

// 추상 클래스: Employee
public abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // 추상 메서드: 급여 계산
    abstract double calculateSalary();

    // 공통 메서드: 정보 출력
    void displayInfo() {
        System.out.println("Employee Name: " + name);
    }
}