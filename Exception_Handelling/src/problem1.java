class Mythread1 extends Thread
{
	Mythread1(String name){
        super(name);
    }
    public void run()
    {
        System.out.println("Hello from"+getName());
    }
}
public class problem1 {
    public static void main(String[] args) throws InterruptedException {
        Mythread1 t1 = new Mythread1("t1");
        Mythread1 t2 = new Mythread1("t2");
        t1.start();
        t2.start();


    }
}
