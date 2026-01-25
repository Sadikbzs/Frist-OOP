import java.util.Scanner;

class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }
}




public class problem2 {
     public static void Age(int age) throws InvalidAgeException{
        if(age>0 || age<120){
            throw new InvalidAgeException("Invalid age");
        }
        else{
            System.out.println("valid age");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int n=sc.nextInt();

        try {
            Age(500);

        }catch (Exception e){
            System.out.println(e);
        }

    }

}
