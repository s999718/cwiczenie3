import java.util.ArrayList;

public class Developer extends Employee {
    private ArrayList<Technology> technologies;

    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public int calculateSalary() {
        int salary = getBaseSalary();
        for (Technology technology : technologies) {
            salary += technology.getBonus();
        }
        return salary;
    }
}
