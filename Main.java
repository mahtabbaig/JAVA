class Student {
    String name;
    int age;
    int rollNo;

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println();
    }
}
public class Main{
    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 19;
        s1.rollNo = 101;

        // Creating second object
        Student s2 = new Student();
        s2.name = "Anjali";
        s2.age = 20;
        s2.rollNo = 102;

        // Creating third object
        Student s3 = new Student();
        s3.name = "Arjun";
        s3.age = 19;
        s3.rollNo = 103;

        // Display details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

