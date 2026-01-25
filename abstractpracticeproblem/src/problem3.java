abstract class Vichel{
    String a;

    public Vichel(String a)
    {
        this.a=a;
        System.out.println("Vichel Constructor");
    }
}
class Moto extends Vichel{

    public Moto(String a) {
        super(a);
    }
    public void getfueltype()
    {
        System.out.println("Moto");
    }
}
class car extends Vichel{
    public car(String a) {
        super(a);
    }
    public void getfueltype()
    {
        System.out.println("Car");
    }
}

public class problem3 {
    public static void main(String[] args) {
        Vichel v=new Moto("Moto");


    }
}
