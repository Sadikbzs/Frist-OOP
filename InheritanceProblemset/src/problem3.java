public class problem3 {
    public static void main(String[] args) {
        car c=new car();
        c.move();
        vehicle v =new vehicle();
        v.move();
    }
}
class vehicle{

    public void move(){
        System.out.println("Vehicle is Moving");
    }
}
class car extends vehicle{
    @Override
    public void move() {
        System.out.println("Car is Moving");
    }
}
