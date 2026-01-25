import java.util.Scanner;

abstract class Shape{
    public void makesound(){
        System.out.println("Shape makesound");
    }
    public abstract double area();

}
class rectangle extends Shape{
    double width,height;
  rectangle(double r1,double r2){
      this.width=r1;
      this.height=r2;

  }
    @Override
    public double area() {
      return height*width;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return 3.1416*radius*radius;
    }

    @Override
    public void makesound() {
        super.makesound();
    }
}




public class problem2 {
    public static void main(String[] args) {
        while(true){
            System.out.println("Enter 1 for rectangle" );
            System.out.println("Enter 2 for circle");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter height and width");
                double r1=sc.nextDouble();
                double r2=sc.nextDouble();
                Shape shape=new rectangle(r1,r2);
                shape.area();
                System.out.println(shape.area());
                break;
            }
            else if(choice==2){
                System.out.println("Enter Radius");
                double r1=sc.nextDouble();
                Shape circle=new Circle(r1);
                circle.area();
                System.out.println("The area is"+circle.area());
                break;
            }
        }

    }
}
