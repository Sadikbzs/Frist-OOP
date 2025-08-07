public class four {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        if (a>b){
            System.out.println(a);
        }
        else if (b>a){
            System.out.println(b);
        }
        else{
            System.out.println("Equall");
        }
    }
}
