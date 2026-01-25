public class Student {
    // Instance variables
    private String name;
    private int rollNo;

    // Constructor to initialize values
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Function to print details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    // Main method to create object and test
    public static void main(String[] args) {
        // Create object and initialize values
        Student s1 = new Student("Rahim", 992400);

        // Print student details
        s1.printDetails();
    }
}
