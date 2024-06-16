import java.util.Calendar;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String pesel;
    private int yearOfEmployment;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public abstract int calculateSalary();

    protected int getBaseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return 3000 + (currentYear - yearOfEmployment) * 1000;
    }
}
