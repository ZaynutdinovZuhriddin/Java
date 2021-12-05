package OOP.Encapsulation.Homework2;

public class MainForEmployee {

    public static void main(String[] args) {

        Employee newMyObj = new Employee();

        newMyObj.setName("Zaynutdinov Zuhriddin");
        newMyObj.setId(1236547);
        newMyObj.setSalary(805000);

        String name = newMyObj.getName();
        int id = newMyObj.getId();
        int salary = newMyObj.getSalary();

        System.out.println("your name: " + name);
        System.out.println("your id: " + id);
        System.out.println("your salary: " + salary);
    }
}
