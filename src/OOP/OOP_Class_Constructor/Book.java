package OOP.OOP_Class_Constructor;

public class Book {

    private String name;
    private String Author;
    private int Price;

    public Book(){
        this.name = "Bogatiy papa i bedniy papa";
        this.Author = "Rober Kiosaki";
        this.Price = 200000;
    }

    public static void main(String[] args) {
        Book book = new Book();

        System.out.println("book's name: " + book.name);
        System.out.println("Author: " + book.Author);
        System.out.println("Price: " + book.Price);
    }

}
