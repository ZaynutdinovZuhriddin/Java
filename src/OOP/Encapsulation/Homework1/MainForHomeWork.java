package OOP.Encapsulation.Homework1;

public class MainForHomeWork {

    public static void main(String[] args) {

        HomeWork barsik = new HomeWork("simba",20,60);
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        System.out.println("imya kota: " + barsikName);
        System.out.println("bozrast kota:  " + barsikAge);
        System.out.println("ves kota: " + barsikWeight);


        System.out.println(barsik.getName());
        barsik.setName("vasiliy");
        System.out.println(barsik.getName());
    }
}
