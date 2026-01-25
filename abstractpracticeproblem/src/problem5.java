public class problem5 {
    public static void main(String[] args) {
     Instrument [] one=new Instrument[2];
     one[0]=new piano();
     one[1]=new guiture();
     one[0].sound();
     one[1].sound();
    }
}
abstract class Instrument{
    abstract void sound();
}
class piano extends Instrument{
    @Override
    public void sound() {
        System.out.println("I am a piano");

    }
}
class guiture extends Instrument{
    @Override
    public void sound() {
        System.out.println("I am a guiture");
    }
}
