package OOP.Encapsulation.Homewrk4;

public class Pen {

    private boolean button; // true - bosilgan bosa  false - bosilmagam bosa
    private double inqAmout;  // siyoh miqdori
    private double inqSpend;  // bita harf uchun rasxod
    private String inqColor;  // siyoh rangi

    // default constructor
    public Pen() {
    }

    public Pen(boolean button, double inqAmout, double inqSpend) {
        this.button = button;
        this.inqAmout = inqAmout;
        this.inqSpend = inqSpend;
    }

    public Pen(boolean button, double inqAmout, double inqSpend, String inqColor) {
        this.button = button;
        this.inqAmout = inqAmout;
        this.inqSpend = inqSpend;
        this.inqColor = inqColor;
    }
    public void clickButton(){
        if (!button) this.button = true;
        else this.button = false;
    }
    public void write(String word){
        if (button){
            if (inqAmout > 0){
                System.out.println(word);
                inqAmout -= word.length() * inqSpend; // yozilgan harflar uchun siyohi sarflaniwi
            }
            else {
                System.out.println("ruchkada siyoh qomagan ");
            }
        }
        else {
            System.out.println("bosiwdan oldin tugmani bos ");
        }

    }
    public void changeStrjen(double inqAmout){
        if (inqAmout > 0) {
            this.inqAmout = inqAmout;
        }
        else {
            System.out.println("0 dan kata son kiriting");
        }
    }

    public boolean isButton() {
        return button;
    }

    public double getInqAmout() {
        return inqAmout;
    }

    public double getInqSpend() {
        return inqSpend;
    }

    public String getInqColor() {
        return inqColor;
    }
}
















