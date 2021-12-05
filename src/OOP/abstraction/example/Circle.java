package OOP.abstraction.example;

public class Circle extends Shape{

    @Override
    double draw(double radius, double b) {
        return Math.PI * radius * radius;
    }
}
