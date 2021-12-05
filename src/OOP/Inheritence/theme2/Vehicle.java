package OOP.Inheritence.theme2;

public class Vehicle {

    protected double speed;
    protected double price;
    protected int year;

    public Vehicle(double speed, double price, int year) {
        this.speed = speed;
        this.price = price;
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
    public void showResult(){
        if (this.year > 2000){
            System.out.println(toString());
        }
    }
}
















