abstract class Employee{
    public abstract void getsalary();
}
class fulltimeemployee extends Employee{
    @Override
    public void getsalary() {
        System.out.println("I am a fulltime employee");
    }
}
class Parttimeemployee extends Employee{
    @Override
    public void getsalary() {
        System.out.println("I am a Parttime employee");
    }
}
public class problem4 {
    public static void main(String[] args) {
        Employee e = new fulltimeemployee();
        e.getsalary();
        Employee e2 = new Parttimeemployee();
        e2.getsalary();

    }
}
