package OOP.Inheritence.theme2;

public class Plane extends Vehicle {

    private double height;
    private int passengers;

    public Plane(double speed, double price, int year,double height,int passengers) {
        super(speed, price, year);
        this.height = height;
        this.passengers = passengers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passengers=" + passengers +
                ", speed=" + speed +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}














