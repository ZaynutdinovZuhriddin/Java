package OOP.Inteface_Abstract.theme;

public class Math implements CalculateSum<Double, Integer>{

    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }
}
