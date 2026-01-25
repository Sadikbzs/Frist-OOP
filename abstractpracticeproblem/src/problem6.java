public class problem6 {
    public static void main(String[] args) {
        Appiliance mic=new washing();
        mic.turnon();
        mic.powerinfo();
        Appiliance w=new Microwave();
        w.turnon();
        w.powerinfo();


    }
}
abstract class Appiliance{
    abstract public void turnon();
    public void powerinfo(){
        System.out.println("this appiliance use electrecity");
    }
}
class washing extends Appiliance {
    @Override
    public void turnon() {
        System.out.println("washing Machine Turned on");
    }
    @Override
    public void powerinfo() {
        System.out.println("this appiliance use electrecity");
    }
}
class Microwave extends Appiliance {
    @Override
    public void turnon() {
        System.out.println("Microwave Turned on");
    }
    @Override
    public void powerinfo() {
        System.out.println("this appiliance use electrecity");
    }
}

