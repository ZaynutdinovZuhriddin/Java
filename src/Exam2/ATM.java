package Exam2;

import java.util.Scanner;

public class ATM {

    private static int Uname;
    private static int pwd;
    private static int money = 0;

    public static void main(String[] args){			//основная функция

        Scanner sc = new Scanner(System.in);		// Вводим серийный номер


        while(true){
            show();
            int index = sc.nextInt();
            if(index == 1){				// зарегистрирован
                register(sc);
            }
            else if(index == 2){				//авторизоваться
                login(sc);
                break;
            }
            else{
                caozuo2(index);
            }
        }

        while(true){
            int index = sc.nextInt();
            if(index == 1){			//Изымать
                Withdrawal(sc);
                int index1 = sc.nextInt();
                if(index1==1 || index1==2){
                    caozuo1(index1);
                }
                else{
                    caozuo2(index1);
                    Withdrawal(sc);
                }
            }

            if(index == 2){			// Проверяем остатки
                select(money);
                int index1 = sc.nextInt();
                if(index1==1 || index1==2){
                    caozuo1(index1);
                }
                else{
                    caozuo2(index1);
                    select(money);
                }
            }
            if(index == 3){			// Депозит в реальном времени
                fund(sc);
                int index1 = sc.nextInt();
                if(index1==1 || index1==2){
                    caozuo1(index1);
                }
                else{
                    caozuo2(index1);
                    fund(sc);
                }
            }
            if(index == 4){				//Оплата
                pay(sc);
                int index1 = sc.nextInt();
                if(index1==1 || index1==2){
                    caozuo1(index1);
                }
                else{
                    caozuo2(index1);
                    pay(sc);
                }
            }
            if(index == 5){				//Перечислить
                EFC(sc);
                int index1 = sc.nextInt();
                if(index1==1 || index1==2){
                    caozuo1(index1);
                }
                else{
                    caozuo2(index1);
                    EFC(sc);
                }
            }
            if(index == 6){			// выходим из программы
                exit();
            }
        }

    }

    public static void caozuo1(int index1){
        if(index1 == 1){		// Вход в главное меню
            menu();
        }
        else if(index1 == 2){		// выходим из программы
            exit();
        }
    }
    public static void caozuo2(int index1){

        System.out.println("Вы введены неверно, повторите ввод!");
        System.out.println("Напоминание: введите цифру 1 или 2!");
    }
    // показать страницу выбора регистрации входа
    public static void show(){
        System.out.println("---------------------");
        System.out.println("Добро пожаловать в эту систему");
        System.out.println("1. Зарегистрироваться");
        System.out.println("2. Войти");
        System.out.println("Добро пожаловать в эту систему");
        System.out.println("---------------------");
        System.out.print("Пожалуйста, введите целочисленный серийный номер: ");
    }

    // зарегистрирован
    public static void register(Scanner sc){
        System.out.print("Пожалуйста, введите имя пользователя: ");
        Uname = sc.nextInt();
        for(int i = 0;i < 3; i++){
            System.out.print("Пожалуйста введите ваш пароль: ");
            pwd = sc.nextInt();
            System.out.print("Пожалуйста, подтвердите пароль еще раз: ");
            int pwd1 = sc.nextInt();
            if(pwd1 == pwd){
                System.out.print("Вы успешно зарегистрировались");
                break;
            }
            else{
                System.out.print("Ошибка при вводе пароля, введите еще раз: ");
            }
        }

    }
    //авторизоваться
    public static void login(Scanner sc){
        for(int i = 0; i < 3; i++){
            System.out.println("Пожалуйста, введите имя пользователя: ");
            int Uname1 = sc.nextInt();
            if(Uname1 == pwd){
                System.out.println("Пожалуйста введите ваш пароль: ");
                int pwd1 = sc.nextInt();
                if(pwd1 == pwd){
                    System.out.println("Успешная посадка");
                    menu();
                    break;
                }
                else{
                    System.out.println("Введенный вами пароль неверен, пожалуйста, войдите снова");
                }
            }
            else{
                System.out.println("Введенная вами учетная запись не существует, пожалуйста, войдите снова");
            }
        }

    }
    // Меню меню
    public static void menu(){			// Главная страница после входа в систему
        System.out.println("----------------------");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("| 1. Снять деньги |");
        System.out.println("| 2. Проверить баланс |");
        System.out.println("| 3. Депозит в реальном времени |");
        System.out.println("| 4. Оплата |");
        System.out.println("| 5. Перевести деньги |");
        System.out.println("| 6. Выход |");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("----------------------");
        System.out.println("Пожалуйста, введите целочисленный серийный номер:");
    }

    public static int Withdrawal(Scanner sc){			//Изымать

        System.out.println("Пожалуйста, введите сумму вывода: ");
        int money1 = sc.nextInt();
        if(money1 > money){
            System.out.println("---------------------------");
            System.out.println("| Добро пожаловать в Банк Китая |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| Извините, на вашем балансе недостаточно |");
            System.out.println("| Транзакция не удалась |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| 1. Вернуться в главное меню |");
            System.out.println("| 2. Выйти из программы |");
            System.out.println("| Добро пожаловать в Банк Китая |");
            System.out.println("---------------------------");
            System.out.println("Пожалуйста, введите целочисленный серийный номер:");
        }
        else{
            money -= money1;
            System.out.println("---------------------------");
            System.out.println("| Добро пожаловать в Банк Китая |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| Успешная сделка |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| 1. Вернуться в главное меню |");
            System.out.println("| 2. Выйти из программы |");
            System.out.println("| Добро пожаловать в Банк Китая |");
            System.out.println("---------------------------");
            System.out.println("Пожалуйста, введите целочисленный серийный номер:");
        }
        return money;

    }



    public static void select(int money){				// Проверяем остатки
        System.out.println("---------------------------");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("| Ваш текущий баланс"+money+"Юань |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("| 1. Вернуться в главное меню |");
        System.out.println("| 2. Выйти из программы |");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("---------------------------");
        System.out.println("Пожалуйста, введите целочисленный серийный номер:");
    }

    public static int fund(Scanner sc){				// Депозит в реальном времени
        System.out.println("Пожалуйста, введите сумму: ");
        int money1 = sc.nextInt();
        money += money1;
        System.out.println("---------------------------");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("| Успешная сделка |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("| 1. Вернуться в главное меню |");
        System.out.println("| 2. Выйти из программы |");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("---------------------------");
        System.out.println("Пожалуйста, введите целочисленный серийный номер:");
        return money;
    }

    public static int pay(Scanner sc){			//Оплата
        System.out.println("---------------------------");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("| 1. Пополнение баланса мобильного телефона |");
        System.out.println("| 2. Выйти из программы |");
        System.out.println("| Добро пожаловать в Банк Китая |");
        System.out.println("---------------------------");
        System.out.println("Пожалуйста, введите целочисленный серийный номер:");
        int index = sc.nextInt();
        if(index == 1){
            System.out.println("Пожалуйста, введите номер вашего мобильного телефона:");
            long phone = sc.nextLong();
            System.out.println("Подтвердите свой номер телефона:");
            long phone1 = sc.nextLong();
            if(phone1 == phone){
                System.out.println("Пожалуйста, введите сумму, которую вы хотите заплатить:");
                int money1 = sc.nextInt();
                if(money1 <= money){
                    System.out.println("---------------------------");
                    System.out.println("| Добро пожаловать в Банк Китая |");
                    System.out.println("|                         |");
                    System.out.println("|                         |");
                    System.out.println("| Успешная сделка |");
                    System.out.println("|                         |");
                    System.out.println("|                         |");
                    System.out.println("| 1. Вернуться в главное меню |");
                    System.out.println("| 2. Выйти из программы |");
                    System.out.println("| Добро пожаловать в Банк Китая |");
                    System.out.println("---------------------------");
                    System.out.println("Пожалуйста, введите целочисленный серийный номер:");
                    money -= money1;
                }
                else{
                    System.out.println("---------------------------");
                    System.out.println("| Добро пожаловать в Банк Китая |");
                    System.out.println("|                         |");
                    System.out.println("|                         |");
                    System.out.println("| Извините, на вашем балансе недостаточно |");
                    System.out.println("| Транзакция не удалась |");
                    System.out.println("|                         |");
                    System.out.println("|                         |");
                    System.out.println("| 1. Вернуться в главное меню |");
                    System.out.println("| 2. Выйти из программы |");
                    System.out.println("| Добро пожаловать в Банк Китая |");
                    System.out.println("---------------------------");
                    System.out.println("Пожалуйста, введите целочисленный серийный номер:");
                }
            }else{
                System.out.println("---------------------------");
                System.out.println("| Добро пожаловать в Банк Китая |");
                System.out.println("|                         |");
                System.out.println("|                         |");
                System.out.println("| К сожалению, вы ввели неверный номер телефона |");
                System.out.println("| Транзакция не удалась |");
                System.out.println("|                         |");
                System.out.println("|                         |");
                System.out.println("| 1. Вернуться в главное меню |");
                System.out.println("| 2. Выйти из программы |");
                System.out.println("| Добро пожаловать в Банк Китая |");
                System.out.println("---------------------------");
                System.out.println("Пожалуйста, введите целочисленный серийный номер:");
            }

        }
        if(index == 2){
            exit();
        }
        return money;
    }

    public static int EFC(Scanner sc){			//Перечислить
        int name = 123123;
        System.out.print("Пожалуйста, введите номер счета другой стороны: ");
        int name1 = sc.nextInt();
        if(name1 == name){
            System.out.println("Пожалуйста, введите сумму, которую вы хотите перевести: ");
            int money1 = sc.nextInt();
            if(money1 <= money){
                System.out.println("---------------------------");
                System.out.println("| Добро пожаловать в Банк Китая |");
                System.out.println("|                         |");
                System.out.println("|                         |");
                System.out.println("| Успешная сделка |");
                System.out.println("|                         |");
                System.out.println("|                         |");
                System.out.println("| 1. Вернуться в главное меню |");
                System.out.println("| 2. Выйти из программы |");
                System.out.println("| Добро пожаловать в Банк Китая |");
                System.out.println("---------------------------");
                System.out.println("Пожалуйста, введите целочисленный серийный номер:");
                money -= money1;
            }
            else{
                System.out.println("---------------------------");
                System.out.println("| Добро пожаловать в Банк Китая |");
                System.out.println("|                         |");
                System.out.println("|                         |");
                System.out.println("| Извините, на вашем счете недостаточно |");
                System.out.println("| Транзакция не удалась |");
                System.out.println("|                         |");
                System.out.println("|                         |");
                System.out.println("| 1. Вернуться в главное меню |");
                System.out.println("| 2. Выйти из программы |");
                System.out.println("| Добро пожаловать в Банк Китая |");
                System.out.println("---------------------------");
                System.out.println("Пожалуйста, введите целочисленный серийный номер:");
            }
        }
        else{
            System.out.println("---------------------------");
            System.out.println("| Добро пожаловать в Банк Китая |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| К сожалению, введенная вами учетная запись не существует |");
            System.out.println("| Транзакция не удалась |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| 1. Вернуться в главное меню |");
            System.out.println("| 2. Выйти из программы |");
            System.out.println("| Добро пожаловать в Банк Китая |");
            System.out.println("---------------------------");
            System.out.println("Пожалуйста, введите целочисленный серийный номер:");
        }
        return money;
    }

    public static void exit(){				// выходим из программы
        System.out.println("-----------------------");
        System.out.println("|                     |");
        System.out.println("|                     |");
        System.out.println("| Спасибо за использование этой программы |");
        System.out.println("|                     |");
        System.out.println("|                     |");
        System.out.println("-----------------------");
    }
}
