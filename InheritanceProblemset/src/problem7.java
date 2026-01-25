public class problem7 {
    public static void main(String[] args) {
        car1 c=new car1(250.66d);
        c.disp();

    }
}
class vichel{
    static double max;
    vichel(double max){
        this.max = max;
    }
}
class car1 extends vichel{
    car1(double max){
        super(max);

    }
   public void disp(){
        System.out.println("max is "+max);
    }
}
