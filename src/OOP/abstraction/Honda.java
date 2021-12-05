package OOP.abstraction;

public class Honda extends Bike{

    public Honda(String name, double price) {
        super(name, price);
    }

    @Override
    void run() {
        System.out.println("honda horowaya mawina!");
    }
}
