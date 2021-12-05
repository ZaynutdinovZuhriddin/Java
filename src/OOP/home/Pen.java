package OOP.home;

public class Pen {

    private boolean button;         //true - qachonki tugma bosilgan boladi. agar bosilmagan bosa false boladi
    private double inqAmount;  // siyoh miqdori
    private double inqSpend;  // 1ta harf uchun sarflanadigan siyoh miqdori
    private String inqColor;  //siyoh rangi

    public Pen(boolean button, double inqAmount, double inqSpend) {
        this.button = button;
        this.inqAmount = inqAmount;
        this.inqSpend = inqSpend;
    }

    public Pen(boolean button, double inqAmount, double inqSpend, String inqColor) {
        this.button = button;
        this.inqAmount = inqAmount;
        this.inqSpend = inqSpend;
        this.inqColor = inqColor;
    }

    public void clickButton() {
        if (button) {
            this.button = false;
        } else {
            this.button = true;
        }
    }

    public void write(String word) {
        if (button) {
            if (inqAmount > 0) {
                System.out.println(word);
                inqAmount -= word.length() * inqSpend;  // yozilgan harlflar uchun siyohning sarflaniwi
            } else {
                System.out.println("ruchkada siyoh qolmagan iltimos zapasni almashtiring ");
            }
        } else {
            System.out.println("yoziwdan oldin tugmani bosing! ");
        }
    }

    public void changeSterjen(double inqAmount) {
        if (inqAmount > 0) {
            this.inqAmount = inqAmount;
        }
    }

    public double getInqAmount() {
        return inqAmount;
    }
}
