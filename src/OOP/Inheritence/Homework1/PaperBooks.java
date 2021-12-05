package OOP.Inheritence.Homework1;

public class PaperBooks extends Ebooks {

    private int deliveryWeight;
    private String deliveryTime;


    public PaperBooks(String author, int price, String title, int pages, String siteName, double siteVolume, int deliveryWeight, String deliveryTime) {
        super(author, price, title, pages, siteName, siteVolume);
        this.deliveryWeight = deliveryWeight;
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryWeight() {
        return deliveryWeight;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }
}

