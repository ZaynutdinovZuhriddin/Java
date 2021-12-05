package OOP.Inheritence.Homework1;

public class MainForHome1 {

    public static void main(String[] args) {

        PaperBooks newObj = new PaperBooks("Rober Kisaki",10000,"bogatiy papa i bedniy papa",238,"UzBooks.uz",200,300,"monday");
        String author = newObj.getAuthor();
        newObj.countBooks();

        int price = newObj.getPrice();
        int pages = newObj.getPages();
        String title = newObj.getTitle();
        String siteName = newObj.getSiteName();
        double siteVolume = newObj.getSiteVolume();
        int deliveryWeight = newObj.getDeliveryWeight();
        String deliveryTime = newObj.getDeliveryTime();

        System.out.println("avtor knigi: " + author);
        System.out.println("stoimost knigi: " + price);
        System.out.println("kolichesvo stranist: " + pages);
        System.out.println("zagalovok: " + title);
        System.out.println("nazvanie sayta: " + siteName);
        System.out.println("obyom satya: " + siteVolume);
        System.out.println("ves producta: " + deliveryWeight);
        System.out.println("vremya dostavki: " + deliveryTime);


    }
}
