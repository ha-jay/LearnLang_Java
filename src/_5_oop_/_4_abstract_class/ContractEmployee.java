package _5_oop_._4_abstract_class;

// 계약직 클래스: ContractEmployee
public class ContractEmployee extends Employee {
    private double contractAmount;

    ContractEmployee(String name, double contractAmount) {
        super(name);
        this.contractAmount = contractAmount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }
}

