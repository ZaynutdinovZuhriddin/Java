package OOP.Encapsulation.Homework1;

public class Account {

    private String BankovskiySchot;
    private String name;
    private int balance;

//    public Account(int bankovskiySchot, String name, int balance) {
//        BankovskiySchot = bankovskiySchot;
//        this.name = name;
//        this.balance = balance;
//    }

    public String getBankovskiySchot() {
        return BankovskiySchot;
    }

    public void setBankovskiySchot(String bankovskiySchot) {
        BankovskiySchot = bankovskiySchot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
