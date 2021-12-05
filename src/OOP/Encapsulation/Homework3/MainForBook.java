package OOP.Encapsulation.Homework3;

public class MainForBook {


    public static void main(String[] args) {

        Book obj = new Book();

        obj.setAuthor("robert kiyosaki");
        obj.setName("bogatiy papa bedniy papa");
        obj.setId(6544);
        obj.setPrice(1500);

        String author = obj.getAuthor();
        String name = obj.getName();
        int id = obj.getId();
        int price = obj.getPrice();

        System.out.println("Author: " + author);
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Price: " + price);
    }
}