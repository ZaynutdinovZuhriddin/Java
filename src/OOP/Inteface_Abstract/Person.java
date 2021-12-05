package OOP.Inteface_Abstract;

public abstract class Person {

    private String firstname;
    private String lastname;
    private Integer age;

    public Person(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public abstract Double findSalary(int perWeek);   // abstract method

    public void eat() {
        System.out.println("men ovqat yeyman");
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(int perWeek) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
