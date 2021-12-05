package EmailTask;

import java.util.Scanner;

public class EmailAppExample {

    public static Scanner scanner;
    public static User[] users;
    public static Email[] emails;
    public static Integer index = 0;
    public static Integer indexEmail = 0;
    public static User Person;

    public static void main(String[] args) {

        users = new User[10000];
        emails = new Email[100000];

        while (true) {
            Menu();
            scanner = new Scanner(System.in);
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    singIn();
                    break;
                case 2:
                    singOn();
                    break;
                case 0:
                    return;

            }
        }
    }

    public static void Menu() {
        System.out.println("Menu");
        System.out.println("1. Sing In");
        System.out.println("2. Sing On");
        System.out.println("0. Exit");
    }

    public static void singOn() {
        scanner = new Scanner(System.in);
        User user = new User();

        System.out.print("First name: ");
        String firstname = scanner.next();

        System.out.print("Last name: ");
        String lastname = scanner.next();

        System.out.print("Password: ");
        String password = scanner.next();

        while (true) {
            System.out.print("Retype Password: ");
            String retype_password = scanner.next();

            if (password.equals(retype_password)) {
                break;
            }
        }
        while (true) {
            System.out.print("Email address: ");
            String email = scanner.next();

            boolean validateEmail = user.validateEmail(email);
            if (validateEmail) {
                user.setEmail(email);
                break;
            } else {
                System.out.println("Email not valid!");
            }
        }
        if (!firstname.isEmpty() && !lastname.isEmpty() && !password.isEmpty()) {
            user.setFirstName(firstname);
            user.setLastName(lastname);
            user.setPassword(password);
        }
        users[index++] = user;
        System.out.println("Congratulation you are registered\n");

    }

    public static void singIn() {
        scanner = new Scanner(System.in);

        System.out.print("Email: ");
        String email = scanner.next();

        for (User user : users) {
            if (user != null) {
                if (user.getEmail().equals(email))
                    Person = user;
            }
        }
        boolean success = false;
        if (Person != null) {
            System.out.print("Password: ");
            String password = scanner.next();

            if (Person.getPassword().equals(password))
                success = true;
        }
        if (success) {
            System.out.println("Welcome to Gmail");
            showEmailMenu();
        }
    }

    private static void showEmailMenu() {

        scanner = new Scanner(System.in);
        System.out.println("1. Send Message");
        System.out.println("2. Unread");
        System.out.println("3. Inbox");
        System.out.println("4. Outbox");
        System.out.println("0. Sing Out");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                SendMessage();
                break;

            case 2:
                Unread();
                break;

            case 3:
                Inbox();
                break;

            case 4:
                Outbox();
                break;
            case 0:
                break;
        }
    }

    private static void Outbox() {

        for (User user : users) {
            if (user != null) {
                if (!user.equals(Person))
                    System.out.println(user.getEmail());
            }
        }
    }

    private static void Unread() {
        System.out.println("etot metod v protsese");
    }

    private static void Inbox() {

        for (Email email : emails) {
            if (email != null) {
                if (email.getReceiver().equals(Person)) {
                    System.out.println("Sender: " + email.getSender().getEmail());
                    System.out.println("Headline: " + email.getTitle());
                    System.out.println("Message: " + email.getBody());
                }
            }
        }
    }

    private static void SendMessage() {
        System.out.println("==============Email Addresses=================");
        for (User user : users) {
            if (user != null) {
                if (!user.equals(Person))
                    System.out.println(user.getEmail());
            }
        }
        System.out.println("===============================");
        scanner = new Scanner(System.in);
        System.out.print("To someone: ");
        String receiverEmailAddress = scanner.next();
        User receiver = null;
        for (User user : users) {
            if (user != null) {
                if (user.getEmail().equals(receiverEmailAddress))
                    receiver = user;
            }
        }

        String subject = scanner.nextLine();
        System.out.print("Message: ");
        scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        emails[indexEmail++] = new Email(subject, message, Person, receiver, true);
        System.out.println("Message sent");

    }
}





