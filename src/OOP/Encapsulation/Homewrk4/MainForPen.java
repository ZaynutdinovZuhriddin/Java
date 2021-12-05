package OOP.Encapsulation.Homewrk4;

public class MainForPen {


    public static void main(String[] args) {

        Pen newObj = new Pen(false,100,10);
        newObj.clickButton();
        System.out.println(" " + newObj.getInqAmout());
        newObj.write("salam" + "alaykum");

        System.out.println(newObj.getInqAmout());

        newObj.changeStrjen(-150);
    }
}
