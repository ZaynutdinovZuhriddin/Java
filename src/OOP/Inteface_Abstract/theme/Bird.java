package OOP.Inteface_Abstract.theme;

public class Bird implements Fly{

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean land() {
        return false;
    }
}
