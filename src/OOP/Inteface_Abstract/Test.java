package OOP.Inteface_Abstract;

public class Test {

    public static void main(String[] args) {

        Person programmer = new Programmer("Zuhriddin", "Zaynutdinov", 23, "Junior", 5);

        Person teacher = new Teacher("Azam", "Turgunov", 22);

        Person zuhriddin = new Programmer("zuhriddin1", "zaynutdinov1", 24, "Middle", 20);

        Double programmerSalary = programmer.findSalary(40);
        Double teacherSalary = teacher.findSalary(48);
        Double zuhriddinSalary = zuhriddin.findSalary(80);


        System.out.println(programmer);
        System.out.println("salary: " + programmerSalary);
        System.out.println("=====================================================================");
        System.out.println(teacher);
        System.out.println("Salary: " + teacherSalary);
        System.out.println("***************************************************************");
        System.out.println(zuhriddin);
        System.out.println("my salary: " + zuhriddinSalary);

    }
}
