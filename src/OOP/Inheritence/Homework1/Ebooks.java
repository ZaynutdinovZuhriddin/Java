package OOP.Inheritence.Homework1;

public class Ebooks extends Books {

    private String siteName;
    private double siteVolume;

    public Ebooks(String author, int price, String title, int pages, String siteName, double siteVolume) {
        super(author, price, title, pages);
        this.siteName = siteName;
        this.siteVolume = siteVolume;
    }

    public String getSiteName() {
        return siteName;
    }

    public double getSiteVolume() {
        return siteVolume;
    }

    public void title(){
    }
}
