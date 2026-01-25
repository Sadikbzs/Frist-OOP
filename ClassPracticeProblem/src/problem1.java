public class problem1 {
    public static void main(String[] args) {
        Book B1=new Book();
        Book B2=new Book();
        B1.author="Bazlur Rashid";
        B1.title="Coding for everyone";
        System.out.println(B1.author);
        System.out.println(B1.title);
    }
    static class Book{
       public String title;
       public String author;

    }
}
