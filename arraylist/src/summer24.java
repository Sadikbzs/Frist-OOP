import java.util.*;

class Student{
    int id;
    String name;
    double gpa;
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

}





public class summer24 {
    public static void main(String[] args) {
        ArrayList<Student> s= new ArrayList <Student>();
        s.add(new Student(101, "Hasibur Rahman ", 3.75));
        s.add(new Student(102, "Mitu  Rahman ", 3.90));
        s.add(new Student(103, "fahim Khan ", 3.40));
        s.add(new Student(104, "Nusrat Jahan ", 3.85));
        s.add(new Student(105,"Aminul Haque",3.85));
        s.add(new Student(106,"Sumaiya Chowdhury",3.78));
        Collections.swap(s, 0, 1);


      //to print the element
        for(Student a:s){
            System.out.println("id:"+a.id+" "+"Name"+a.name+" "+"Ggpa"+a.gpa);
        }

      }



    }

