package OOP.Inteface_Abstract;

public class Programmer extends Person implements Incentive {

    private String level;
    private int rete;

    public Programmer(String firstname, String lastname, Integer age, String level, int rete) {
        super(firstname, lastname, age);
        this.level = level;
        this.rete = rete;
    }

    @Override
    public Double findSalary(int perWeek) {

        double salaryPerHour = 0.0;
        int amountIncentive = 0;

        switch (level) {

            case "Junior":
                if (isIncentive())
                    amountIncentive = 200;
                salaryPerHour = 8.0;
                break;

            case "Middle":
                if (isIncentive())
                    amountIncentive = 400;
                salaryPerHour = 14.0;
                break;

            case "Senior":
                if (isIncentive())
                    amountIncentive = 600;
                salaryPerHour = 30;
                break;
        }

        return 4 * salaryPerHour * perWeek + amountIncentive;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "level=" + level + ", " +
                super.toString();
    }

    @Override
    public boolean isIncentive() {
        if (rete > 10) {
            return true;
        } else {
            return false;
        }
    }
}
