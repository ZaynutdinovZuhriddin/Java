package Exam1;

import java.util.Random;
import java.util.Scanner;

public class ATM_machine {

    Scanner input = new Scanner(System.in);

    User[] users = new User[1000];

    int size = 3;

    public ATM_machine() {

        User user = new User();

        users[0] = new User("622202020004613255", "551822644215423657", "Чжан Сан", "123456", "13785324722", 2000.0);


        users[1] = new User("622202020005461325", "552311544720264519", "   ", "123456", "13213241452", 3000.0);


        users[2] = new User("622202020005851597", "552344200548987219", "   ", "123321", "13725474254", 5000.0);
    }

    public void welcomeMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("1. Войти 2. Зарегистрироваться");
        System.out.println("---------------------------------------------------");
        System.out.print("Пожалуйста, введите код операции:");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                this.login();
                break;
            case 2:
                this.register();
                this.login();
                break;
            default:
                System.out.println("Войти неверно, пожалуйста, войти в систему");
        }
    }

    public void login() {

        System.out.print("Пожалуйста, введите номер карты:");
        String no = input.next();
        System.out.print("Пожалуйста, введите пароль:");
        String pwd = input.next();

        User u = check(no, pwd);

        if (u != null) {
            this.showMenu(u);
        } else {
            System.out.println("Неверное имя пользователя или пароль");
        }
    }

    public void register() {
        System.out.print("Пожалуйста, введите ваше имя:");
        String uname = input.next();

        System.out.print("Пожалуйста, введите идентификационный номер:");
        String id = input.next();

        System.out.print("Пожалуйста, введите номер телефона:");
        String phone = input.next();

        System.out.print("Пожалуйста, введите пароль:");
        String pwd = input.next();

        System.out.print("Пожалуйста, введите предварительно сохраненную сумму:");
        double money = input.nextDouble();

        String myCardNo = this.getRandomCardNo();

        User user = new User();
        user.setCardNo( myCardNo );
        user.setUsername(uname);
        user.setIdentity(id);
        user.setPhone(phone);
        user.setPassword(pwd);
        user.setBalance(money);

        users[size] = user;
        size++;

        System.out.println("Успешная регистрация, номер вашей карты:" + myCardNo);

    }

    public String getRandomCardNo() {
        String prefix = "62220202000";

        Random random = new Random();

        int r = random.nextInt(9000000);

        return prefix + (r + 1000000);
    }

    // проверка
    public User check(String no, String pwd) {// Принцип единой функции
        for (int i = 0; i < size; i++) {
            // подтвердить номер карты и пароль

            // если (пользователи [I]! = NULL) {// Неавтоматическое суждение
            if (no.equals(users[i].getCardNo()) && pwd.equals(users[i].getPassword())) {
                // Найти этот пользователь, пользователь существует
                return users[i];//существовать
            }
        }

        return null;
    }

    public void showMenu(User u) {
        int choice;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1. Изменить зарезервированный мобильный телефон № 2. Депозит 3. Снятие 4. Передача 5. Баланс запросов 6. Изменение пароля 7. Учетная запись Выйти 0.");
            System.out.println("---------------------------------------------------");
            System.out.print("Пожалуйста, введите код операции:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Изменить зарезервированный номер мобильного телефона");
                    break;
                case 2:
                    System.out.println("Выполнить депозит");
                    break;
                case 3:
                    this.withdrawal(u);
                    break;
                case 4:
                    System.out.println("Выполнение");
                    break;
                case 5:
                    System.out.println("Выполнить баланс запроса");
                    break;
                case 6:
                    System.out.println("Исполнение Изменить пароль");
                    break;
                case 7:
                    this.cancel(u);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Войти неверно, пожалуйста, войти!");
            }
        } while (true);
    }

    public void cancel(User user) {

        int index = size + 1;

        for (int i = 0; i < size; i++) {

            if (users[i] == user) {
                index = i;
                break;
            }
        }

        for (int i = index; i < size - 1; i++) {//index = 0； size = 2
            users[i] = users[i + 1];
        }
        size--;
    }

    public void withdrawal(User mine) {
        System.out.print("Пожалуйста, введите сумму оплаты:");
        double money = input.nextDouble();

        if (money < users[0].getBalance()) {
            mine.setBalance(mine.getBalance() - money);
            System.out.println("Успешный вывод, текущий баланс" + mine.getBalance());
        } else {
            System.out.println("Недостаточный баланс");
        }
    }
}
