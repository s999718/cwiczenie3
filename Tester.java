import java.util.ArrayList;

public class Tester extends Employee {
    private ArrayList<String> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        int salary = getBaseSalary();
        salary += testTypes.size() * 300;
        return salary;
    }
}
