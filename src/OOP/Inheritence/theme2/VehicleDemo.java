package OOP.Inheritence.theme2;

import OOP.Inheritence.theme2.LoadDateVehicle;
import OOP.Inheritence.theme2.Vehicle;

public class VehicleDemo {

    public static void main(String[] args) {
        LoadDateVehicle loadDateVehicle = new LoadDateVehicle(2);
        loadDateVehicle.generateData();

        Vehicle[] vehicles = loadDateVehicle.getVehicles();

        vehicles[0].showResult();
        vehicles[1].showResult();

    }
}
