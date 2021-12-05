package Exam1;

public class User {

    private String cardNumber;//номер карты
    private String identity;//идентификационный номер
    private String username;//имя пользователя
    private String password;//пароль
    private String phone;//телефонный номер
    private double balance;// остаток средств

    public User(){

    }

    public User(String cardNumber , String identity , String username ,
                String password , String phone , double balance){
        this.cardNumber = cardNumber;
        this.identity = identity;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.balance = balance;
    }

    public void setCardNo(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getCardNo(){
        return this.cardNumber;
    }
    public void setIdentity(String identity){
        this.identity = identity;
    }

    public String getIdentity(){
        return this.identity;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setBalance(double balance ){
        this.balance= balance;
    }

    public double getBalance(){
        return this.balance;
    }

}
