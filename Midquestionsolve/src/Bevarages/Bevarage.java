package Bevarages;

public class Bevarage {
    String name;
    double price;

    public Bevarage() {
    }

    public Bevarage(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getDescription() {
        System.out.println(name);
    }

}
