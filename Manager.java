import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
    private ArrayList<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int salary = getBaseSalary();
        for (Goal goal : goals) {
            if (goal.isAchieved()) {
                salary += goal.getBonus();
            }
        }
        return salary;
    }
}
