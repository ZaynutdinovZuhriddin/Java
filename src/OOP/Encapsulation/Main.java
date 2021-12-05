package OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Area newObj = new Area();
        newObj.setA(5);
        newObj.setB(6);
//        newObj.getArea();

        int a = newObj.getA();
        int b = newObj.getB();

        System.out.println(a * b);
    }
}
