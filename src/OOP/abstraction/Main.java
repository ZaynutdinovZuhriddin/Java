package OOP.abstraction;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Honda("nexia",15000.0);
        bike.run();

        Bike bike1 = new Yawa("spark",7000.0);
        bike1.run();
    }
}
