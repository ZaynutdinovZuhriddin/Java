package OOP.collections;

import java.util.*;

public class CarMain {


    public static void main(String[] args) {


        Map<Car, Integer> map = new TreeMap<>();

        map.put(new Car("Mercedes", 45000),1);
        map.put(new Car("Mercedes", 1000),2);
        map.put(new Car("chevrolet", 4000),3);
        map.put(new Car("ferrari", 3000),4);
        map.put(new Car("lamborghini", 45000),5);
        map.put(new Car("Volkswagen", 45000),6);

        /*map.forEach((key,value) ->{
            if (value.getModel().equals("Mercedes"))
                System.out.println(value);
        });*/

    }
}
