public class problem7 {
    public static void main(String[] args) {
        person t=new teacher();
        t.getdetails();
        t.sayhello();
        person s=new student();
        s.getdetails();
        s.sayhello();

    }
}
abstract class person{
    abstract public void getdetails();
    public void sayhello(){
        System.out.println("hello");
    }
}
class student extends person{
    @Override
    public void sayhello(){
        System.out.println("hello from student ");
    }

    @Override
    public void getdetails() {
        System.out.println("I am a student");
    }
}
class teacher extends person{
    @Override
    public void sayhello(){
        System.out.println("hello from teacher");
    }
    @Override
    public void getdetails() {
        System.out.println("I am a teacher");
    }
}