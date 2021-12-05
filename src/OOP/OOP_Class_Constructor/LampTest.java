package OOP.OOP_Class_Constructor;

public class LampTest {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(true);
        Lamp otherLamp = new Lamp(false);

        lamp.turnOn();
        otherLamp.turnOn();
    }
}
