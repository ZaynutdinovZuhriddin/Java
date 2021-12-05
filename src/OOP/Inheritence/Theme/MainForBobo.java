package OOP.Inheritence.Theme;

public class MainForBobo {

    public static void main(String[] args) {

        Bobo newObj = new Bobo();
        Ota newObj1 = new Ota();
        Ogil newObj2 = new Ogil();
        Nabira newObj3 = new Nabira();

        System.out.println("bu bob object");
        newObj.nafasol();
        System.out.println("bu ota object");
        newObj1.nafasol();
        newObj1.taomlan();
        System.out.println("bu ogil object");
        newObj2.nafasol();
        newObj2.taomlan();
        newObj2.kompiw();
        System.out.println("bu nabira object");
        newObj3.nafasol();
        newObj3.taomlan();
        newObj3.kompiw();
        newObj3.dastur();

    }
}
