package OOP.Inteface_Abstract;


// interface class bu
//bu classdan extends qib bomidi faqat implements qsa boladi va uni ichidigi metodlani @overlide qiliw kere
public interface Incentive {

    // ichiga faqat ochsa boladi |
    //                           \/
    // 1) abstract metod
    boolean isIncentive();

    //2) sattic metod
    public static void showResult() {
        System.out.println("i came from static method");
    }

    //2) default method yozsa boladi
    default void showDefault() {
        System.out.println("i came from default method");
    }

}
