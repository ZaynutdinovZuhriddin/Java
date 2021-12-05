package OOP.abstraction.example1;

public class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("zuhriddin","zaynutdinov",24,"junior");

        Teacher teacher = new Teacher("gayrataka","goipov",40);

        Double programmerSalary = programmer.findSalary(8);
        Double teacherSalary = programmer.findSalary(40);

        System.out.println(programmerSalary);
        System.out.println(teacherSalary);
    }
}
