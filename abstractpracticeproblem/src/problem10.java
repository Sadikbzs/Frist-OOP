public class problem10 {
    public static void main(String[] args) {
        Device p1=new phone();
        p1.deviceinfo();
        p1.functionality();
        Device p2=new tab();
        p2.deviceinfo();
        p2.functionality();

    }
}
abstract class Device{
    public final  void deviceinfo(){
        System.out.println("This is device info");
    }
    abstract void functionality();
}
class phone  extends Device{
    @Override
    void functionality() {
        System.out.println("This is phone functionality");
    }

}
class tab extends Device{
    @Override
    void functionality() {
        System.out.println("This is tab functionality");
    }
}