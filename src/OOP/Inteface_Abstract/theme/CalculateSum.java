package OOP.Inteface_Abstract.theme;

@FunctionalInterface
public interface CalculateSum<T, A> {

    // T - eto generic type - to yest obwiy(umumiy) type

    T sum(T a,T b);

    static void showStatic(){
        System.out.println("test static");
    }

    static void showStatic2(){
        System.out.println("test static");
    }

    default void show(){
        System.out.println("test default");
    }
}
