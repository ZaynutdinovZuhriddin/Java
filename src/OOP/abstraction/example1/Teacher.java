package OOP.abstraction.example1;

public class Teacher extends Person{

    public Teacher(String firstname, String lastname, Integer age) {
        super(firstname, lastname, age);
    }

    @Override
    public Double findSalary(int perWeek) {
        double perHour = 3.0;
        return 4 * perWeek * perHour;
    }

    @Override
    public void eat() {
        System.out.println("oqituvchi ovqatlanadi");
    }
}
