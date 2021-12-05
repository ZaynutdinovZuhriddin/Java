package OOP.abstraction.example;

public class Main {
    public static void main(String[] args) {

//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//
//        circle.draw();
//        rectangle.draw();
//
//        if (circle instanceof Shape){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }

        Shape shape = new Circle();
        double result = shape.draw(15, 5);

        System.out.printf("doira yuzasi s= %.3f",result,"ga teng");

        Shape shape1 = new Rectangle();
        double result1 = shape1.draw(10, 20);
        System.out.println("kvadrati d= " + result1 + "ga teng");
    }
}
