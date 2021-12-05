package Exam3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AtmDaoImpl implements AtmDao {

    private List<Card> cardList = null;
    private Map<String, Card> cardMap = null;
    private Set<Card> cardSet = null;
    private Card card = null;

    // Способ изготовления агентство ATM
//    public AtmDaoImpl() {
//        cardInfo();
//    }

    // магазин счета все оперативную информацию
    List<String> AllIn = new ArrayList<>();
    // Передача информации магазина
    List<String> OutIn = new ArrayList<>();
    // сканеры объектов
    Scanner scanner = new Scanner(System.in);

    // Инициализировать информацию банковской карты
//    public void cardInfo() {
//        CardInfo cardInfo = new CardInfo();
//        cardList = cardInfo.getCardInfo();
//        cardMap = cardInfo.getCardInfoMap();
//      cardSet = cardInfo.getCardInfoSet();
//    }

    public void login() {
        if (card != null) {
            // отображение меню
            showMenu();
        }
        System.out.println("Пожалуйста, введите банковский карточный счет: ");
        String inaccount = scanner.next();
        boolean cz = true;
        // определить, есть ли карты
        for (String key : cardMap.keySet()) {
            if (inaccount.equals(key)) {
                card = cardMap.get(key);
                System.out.println("Пожалуйста, введите пароль банковской карты: ");
                String inpassword = scanner.next();
                cz = false;
                // определить, правильно ли пароль
                if (inpassword.equals(card.getPassword())) {
                    // Информация Войти в Alllist
                    String str = "Заведующий хозяйством:" + card.getName() + "   учетная запись:" + card.getAccount();
                    AllIn.add(str);
                    OutIn.add(str);
                    // отображение меню
                    showMenu();
                } else {
                    System.out.println("Неправильный пароль, пожалуйста, введите заново");
                    login();
                }
            } else {// перерегистрировать
                continue;
            }
        }
        if (cz) {
            System.out.println("Пользователь не существует");
            login();
        }
    }

    // отобразить главное меню
    public void showMenu() {
        // 4, чтобы отобразить главное меню.
        System.out.println("***********************************");
        System.out.println("*******Введите тип операции, которую вы хотите *******");
        System.out.println("****** 1. 2. Выход запрос баланса ***********");
        System.out.println("****** 3. 4. Передача *********** депозит");
        System.out.println(" ******5. 6. Распечатать карту обратно ***********");
        System.out.println(" ******7. передача информации запрос **************");
        System.out.println("**********************************");
    }

    @Override
    public void inquireMoney() {
        // Текущая операция в Alllist
        String str = "Запрос баланса ---- > Текущие запросы о состоянии счета." + card.getBalance();
        AllIn.add(str);
        System.out.println("Текущие запросы о состоянии счета." + card.getBalance());
    }

    @Override
    public void takeMoney() {
        System.out.println("Введите сумму вывода: ");
        double outMoney = scanner.nextDouble();
        if (outMoney >= 0 && outMoney <= card.getBalance()) {
            card.setBalance(card.getBalance() - outMoney);
            // Текущая операция в Alllist
            String str = "Изъятие---- > до вывода: " + (card.getBalance() + outMoney) + "Снятия: " + outMoney + "Запрос текущего баланса счета: " + card.getBalance();
            AllIn.add(str);
            System.out.println("Текущие запросы о состоянии счета." + card.getBalance());
        } else {
            System.out.println("Ошибка сумма Изъятие или отсутствие баланса: ");
            takeMoney();
        }
    }

    @Override
    public void saveMoney() {
        System.out.println("Пожалуйста, введите сумму депозита: ");
        double inMoney = scanner.nextDouble();
        if (inMoney >= 0) {
            card.setBalance(card.getBalance() + inMoney);
            // Текущая операция в Alllist
            String str = "Депозит ----> Депозит:" + (card.getBalance() - inMoney) + "Депозит: " + inMoney + "Запрос текущего баланса счета: " + card.getBalance();
            AllIn.add(str);
            System.out.println("Текущие запросы о состоянии счета." + card.getBalance());
        } else {
            System.out.println("Ошибка ввода Сумма вклада: ");
            saveMoney();
        }
    }

    @Override
    public void turnMoney() {
        System.out.println("Пожалуйста, введите перевод счета банковской карты: ");
        String turnaccount = scanner.next();
        boolean cz = true;
        if (turnaccount.equals(card.getAccount())) {
            System.out.println("Не могу передать себя !!!!");
            cz = false;
            turnMoney();
        } else {
            // определить, есть ли карты
            for (String key : cardMap.keySet()) {
                if (turnaccount.equals(key)) {
                    Card turncard = cardMap.get(key);
                    System.out.println("Пожалуйста, введите сумму перевода: ");
                    double turnMoney = scanner.nextDouble();
                    cz = false;
                    // определить, правильно ли пароль
                    if (turnMoney >= 0 && turnMoney <= card.getBalance()) {
                        card.setBalance(card.getBalance() - turnMoney);
                        turncard.setBalance(turncard.getBalance() + turnMoney);
                        // Текущая операция в Alllist, Утин
                        String str = "Перенести---- > перед передачей: "
                        +(card.getBalance() + turnMoney) + "  передача:" + turnMoney + "Запрос текущего баланса счета:"
                        +card.getBalance() + "Перенести глава семьи: " + turncard.getName() + "Перенести счет:"
                        +turncard.getAccount();
                        AllIn.add(str);
                        OutIn.add(str);
                        System.out.println("Текущие запросы о состоянии счета." + card.getBalance());
                    } else {
                        System.out.println("Передайте ошибку количество или отсутствие баланса: ");
                        turnMoney();
                    }
                } else {// перерегистрировать
                    continue;
                }
            }
        }
        if (cz) {
            System.out.println("Пользователь не существует");
            turnMoney();
        }
    }

    @Override
    public void print() {
        System.out.println("Путь для хранения файла: C: \\ m.txt");
        // открыть файл
        File file = new File("C:\\m.txt");
        if (file.exists()) {// определить, существует ли файл, есть удаленный
            file.delete();
        }

        try {
            FileWriter fw = new FileWriter(file);
            ;
            for (String str : AllIn) {
                fw.write(str + "\n");
                fw.write("--------------------------------------" + "\n");
                fw.flush();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void checkCard() {
        System.out.println("Информация Текущий счет: " + card.toString());
        System.out.println("Спасибо, приглашает посетить в следующий раз !!!");
    }

    @Override
    public void queryTurnI() {
        // цикл за счет использования информации пользователя Карта
        System.out.println("-----------------------");
        for (String str : cardMap.keySet()) {
            Card card = cardMap.get(str);
            System.out.println(card.getName() + "\t" + card.getAccount() + "\t" + card.getPassword() + "\t" + card.getBalance() + "\t" + card.getBankName());

        }
        System.out.println("Текущие пользователи передачи информации----------");
        for (String str : OutIn) {
            System.out.println(str);
        }
        if (OutIn.size() == 1) {
            System.out.println("Текущий пользователь не передает информацию !!!!");
        }
        System.out.println("-----------------------");
    }
}
