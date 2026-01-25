class animal{
    public void makesound(){
        System.out.println("This is animal sound");
    }
}
class cat extends animal{
    @Override
    public void makesound() {
        System.out.println("Brack");
    }
}


public class problem1 {
    public static void main(String[] args) {
        animal a;
        a = new cat();
        a.makesound();

    }
}
