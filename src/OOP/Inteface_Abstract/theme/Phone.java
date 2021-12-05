package OOP.Inteface_Abstract.theme;

public class Phone implements Switchable, Fly{

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public boolean isOf() {
        return false;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean land() {
        return false;
    }
}
