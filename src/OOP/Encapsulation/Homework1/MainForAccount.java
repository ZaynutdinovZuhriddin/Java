package OOP.Encapsulation.Homework1;

public class MainForAccount {

    public static void main(String[] args) {

        Account newObj = new Account();

        newObj.setBankovskiySchot("4568 2311 5820 1498");
        newObj.setName("Zaynutdinov Zuhriddin");
        newObj.setBalance(1000000000);

        String bankovskiySchot = newObj.getBankovskiySchot();
        String name = newObj.getName();
        int balance = newObj.getBalance();

        System.out.println("your bankovskiySchot: " + bankovskiySchot);
        System.out.println("your name: " + name);
        System.out.println("your balance: " + balance);


    }
}
