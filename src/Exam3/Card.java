package Exam3;

public class Card {

    private String account;  //учетная запись
    private String password; //пароль
    private double balance;  // Остаток средств
    private String bankName; // имя банковской карты
    private String name;     //Имя владельца карты

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card(String account, String password, double balance, String bankName, String name) {
        this.account = account;
        this.password = password;
        this.balance = balance;
        this.bankName = bankName;
        this.name = name;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", bankName='" + bankName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
