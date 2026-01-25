abstract class Animal{
    public abstract void makesound();
}
class Cat extends Animal{
    @Override
    public void makesound() {
        System.out.println("I am a cat");
    }
}
class Dog extends Animal{
    @Override
    public void makesound() {
        System.out.println("I am a dog");
    }
}





public class problem1 {
    public static void main(String[] args) {
        Animal obj=new Cat();
        obj.makesound();
        obj=new Dog();
        obj.makesound();

    }
}
