package OOP.Encapsulation;

public class Area {

    int a;
    int b;

//    public Area(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

// Setter malumotlarni yoziw
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Getter malumotlarni oqiw

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }


//    public void getArea(){
//        int area = a * b;
//        System.out.println("Area: " + area);
//    }
}
