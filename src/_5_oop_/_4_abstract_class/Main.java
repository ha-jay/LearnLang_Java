package _5_oop_._4_abstract_class;

public class Main {
    public static void main(String[] args) {
        // 다형성 배열 생성
        Employee[] employees = new Employee[3];

        // 다양한 직원 객체 저장
        employees[0] = new FullTimeEmployee("Alice", 5000);
        employees[1] = new PartTimeEmployee("Bob", 20, 120);
        employees[2] = new ContractEmployee("Charlie", 3000);

        // 배열 순회하며 직원 정보 출력 및 급여 계산
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}
