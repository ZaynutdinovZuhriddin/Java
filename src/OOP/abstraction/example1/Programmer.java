package OOP.abstraction.example1;

public class Programmer extends Person {
    private String level;

    public Programmer(String firstname, String lastname, Integer age,String level) {
        super(firstname, lastname, age);
        this.level = level;
    }

    @Override
    public Double findSalary(int perWeek) {
        double salaryPerHour;
        switch (level){
            case "junior":
                salaryPerHour = 8;
                break;

            case "middle":
                salaryPerHour = 12;
                break;

            case "senior":
                salaryPerHour = 16;
                break;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "level='" + level + '\'' +
                '}';
    }
}
