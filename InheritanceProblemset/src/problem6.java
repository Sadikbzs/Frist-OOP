public class problem6 {
    public static void main(String[] args) {
        autowashingmachine a = new autowashingmachine();
        a.turnon();

    }
}
class appliance{
    public void turnon(){
        System.out.println("This is appliance class");
    }

}
class washingmachine extends appliance{
    @Override
    public void turnon() {
        super.turnon();
    }
    void starwash(){
        System.out.println("Washing machine Start washing ");
    }
}
class autowashingmachine extends washingmachine{
    @Override
    public void turnon() {
        super.turnon();

    }
     public void autostart(){
         System.out.println("auto start method called ");
     }
}