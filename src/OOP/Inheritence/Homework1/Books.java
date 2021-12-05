package OOP.Inheritence.Homework1;

public class Books {

    private String Author;
    private int price;
    private String title;
    private int pages;

    public Books(String author, int price, String title, int pages) {
        Author = author;
        this.price = price;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void countBooks(){
        if (pages < 300){
            this.price += 100;
        }
        else{
            System.out.println("skidka na etu knigu");
        }
    }

    public void customs(){

    }

}




















