package OOP.OOP_Class_Constructor;

public class OOP {

//    fields
    private  String name;
    private  String model;
    private  String color;
    private String vin_number;
    private int year;
    //methods

    public OOP(String vin,String model,String color,int year,String name){
        this.vin_number = vin;
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void start(){
        System.out.println("started " + this.name);
    }
    public void stop(){
        System.out.println("stopped " + this.name);
    }



}
