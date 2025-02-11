package OOP;

// Base class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (inherits from Person)
class Student extends Person {
    int studentId;

    // Constructor
    public Student(String name, int age, int studentId) {
        super(name, age); // Calling superclass constructor
        this.studentId = studentId;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class method
        System.out.println("Student ID: " + studentId);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 12345);
        student.displayInfo();
    }
}
