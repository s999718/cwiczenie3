import java.util.Calendar;

public class Goal {
    private int year;
    private int month;
    private int day;
    private String name;
    private int bonus;

    public Goal(int year, int month, int day, String name, int bonus) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.bonus = bonus;
    }

    public boolean isAchieved() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) == year && now.get(Calendar.MONTH) + 1 == month && now.get(Calendar.DAY_OF_MONTH) == day;
    }

    public int getBonus() {
        return bonus;
    }
}
