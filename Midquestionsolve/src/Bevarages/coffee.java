package Bevarages;


public class coffee extends Bevarage {
    double cafinelevel;



    public coffee(String name, double price, double cafinelevel) {
        super(name, price);
        this.cafinelevel = cafinelevel;
    }

    @Override
    public void getDescription() {
        super.getDescription();
    }
    public void ShowRoasttype(){
        System.out.println("Roast Type");
    }
}

