public class five {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if (args.length==2){
            int area= a*b;
            System.out.println("Area is "+area);
        }
        else {
            System.out.println("Invalid dimensons");
        }
        }

    }

