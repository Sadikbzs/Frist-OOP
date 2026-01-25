



public class problem12 {

    public static void main(String[] args) {
        Appliance wm=new AIRcondition();
        Appliance ac=new WasingMachine();
        wm.start();
        ac.start();


    }
}
interface Appliance {
    void start();

}
class WasingMachine implements Appliance {
    public void start() {
        System.out.println("Wasing machine");
    }
}
class AIRcondition implements Appliance {
    public void start() {
        System.out.println("AIRcondition");
    }
}