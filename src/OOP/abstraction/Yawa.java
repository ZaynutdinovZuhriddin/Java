package OOP.abstraction;

public class Yawa extends Bike{

    public Yawa(String name, double price) {
        super(name, price);
    }

    @Override
    void run() {
        System.out.println("yawa wefwefwef");
    }
}
