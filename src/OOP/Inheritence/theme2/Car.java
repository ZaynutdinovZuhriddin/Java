package OOP.Inheritence.theme2;

public class Car extends Vehicle {

    public Car(double speed, double price, int year) {
        super(speed, price, year);
    }

    public void moveCar(){
        System.out.println("moving.....");
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

}
