class Person
{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void printage()
    {
        System.out.println(this.age);
    }
}
public class PROBLEM1 {
    public static void main(String[] args) {
        Person p1=null;
        try{
            p1.printage();
    }
        catch (Exception e){
        System.out.println(e);}
    }
}
