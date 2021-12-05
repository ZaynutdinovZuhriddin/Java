package OOP.OOP_Class_Constructor;

public class Main {

    public static void main(String[] args) {

        //create new object
        OOP spark = new OOP("qw123456","Chevrolet","red",1996,"spark");
        OOP matiz = new OOP("wer123456","Chevrolet","black",1991,"matiz");
        OOP nexia = new OOP("zxcv123456","Chevrolet","white",1990,"nexia");
        OOP lacetti = new OOP("frt123654","Chevrolet","green",2003,"lacetti");
        OOP damas = new OOP("sfwef343432323","Chevrolet","blue",2006,"damas");


        spark.start();
        matiz.start();
        nexia.start();
        lacetti.start();
        damas.start();


        spark.stop();
        matiz.stop();
        nexia.stop();
        lacetti.stop();
        damas.stop();




    }
}
