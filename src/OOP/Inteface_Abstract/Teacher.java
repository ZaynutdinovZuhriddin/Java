package OOP.Inteface_Abstract;

public class Teacher extends Person implements Incentive {

    public Teacher(String firstname, String lastname, Integer age) {
        super(firstname, lastname, age);
    }

    @Override
    public Double findSalary(int perWeek) {

        double perHour = 3.0;
        return 4 * perWeek * perHour;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isIncentive() {
        return false;
    }
}
