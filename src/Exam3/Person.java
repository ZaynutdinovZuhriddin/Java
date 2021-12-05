package Exam3;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        // Логин пожалуйста
        System.out.println("Добро пожаловать система ATM --- ---");
        AtmDaoImpl atmDao = new AtmDaoImpl();
        Scanner scanner = new Scanner(System.in);
        boolean type = true;
// вызов метода входа в систему
        atmDao.login();
        while (type) {

            System.out.println("--- Пожалуйста, выберите тип операции, которую вы хотите * ---");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    atmDao.inquireMoney();
                    atmDao.showMenu();
                    break;
                case 2:
                    atmDao.takeMoney();
                    atmDao.showMenu();
                    break;
                case 3:
                    atmDao.saveMoney();
                    atmDao.showMenu();
                    break;
                case 4:
                    atmDao.turnMoney();
                    atmDao.showMenu();
                    break;
                case 5:
                    atmDao.print();
                    atmDao.showMenu();
                    break;
                case 6:
                    atmDao.checkCard();
                    type = false;
                    break;
                case 7:
                    atmDao.queryTurnI();
                    atmDao.showMenu();
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
    }
}
