public class problem4 {
    public static void main(String[] args) {
        parent p=new parent();
        p.move();
        child c=new child();
        c.move();
    }
}
class parent{
    public void move(){
        System.out.println("This is parent class");
    }
}
class child extends parent {
    @Override
    public void move() {
        super.move();
    }
}