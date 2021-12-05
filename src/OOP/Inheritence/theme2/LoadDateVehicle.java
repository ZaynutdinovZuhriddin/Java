package OOP.Inheritence.theme2;

public class LoadDateVehicle {

    private Vehicle[] vehicles;

    // String[] names = new String[15];

    public LoadDateVehicle(int size) {
        vehicles = new Vehicle[size];
    }

    public void  generateData(){
        vehicles[0] = new Car(80,15,2018);
        vehicles[1] = new Plane(300,3500000,2018,400.0,30);
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}
