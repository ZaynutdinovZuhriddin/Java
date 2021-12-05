package OOP.home;

public class PenDemo {

    public static void main(String[] args) {

        Pen pen = new Pen(false, 100,10);
        pen.clickButton();
        System.out.println(pen.getInqAmount());
        pen.write("salom alekum");
        System.out.println(pen.getInqAmount());

    }
}
