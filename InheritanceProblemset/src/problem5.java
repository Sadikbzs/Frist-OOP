public class problem5 {
    public static void main(String[] args) {
        employee  e=new employee("ABC");
        e.displayinfo();
    }
}
class person1{
    protected String name;
}
class employee extends person1{

    employee(String name){
        super();
        this.name = name;

    }
    void displayinfo(){
        System.out.println("name is "+name);
    }

}