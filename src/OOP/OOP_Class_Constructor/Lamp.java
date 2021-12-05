package OOP.OOP_Class_Constructor;

public class Lamp {
    private boolean isOn;

    public Lamp(boolean isOn){
        this.isOn = isOn;
    }

    public void turnOn() {
        System.out.println("Light on? " + this.isOn);
    }

    public void turnOff(){
        System.out.println("Light off?" + this.isOn);
    }
}
