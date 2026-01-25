public class problem2 {
    public static void main(String[] args) {
        student s=new student("Sadik",281);
        s.printdetails();
    }
}
class person{
    String name;
    public person(String name){
        this.name=name;
    }
}
class student extends person{
    int roll;
    public student(String name,int roll){
        super(name);
        this.name=name;
        this.roll=roll;
    }
    public void printdetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }

}
