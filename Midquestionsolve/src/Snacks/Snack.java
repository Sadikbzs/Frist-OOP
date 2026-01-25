package Snacks;

public class Snack {
    String name;
    double price;

    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Snack() {};
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   public void getdescription(){
       System.out.println("Snacks Details");
   }

}
class Sandwithch{
    String breadtype;
    public void getdescription(String breadtype) {

    }
    void showcal(){
        System.out.println("Calories");
    }
    }

