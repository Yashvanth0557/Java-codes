class Student {
    int rollNo;
    String name;
    String dept;
    String section;
    int year;
    Student(int rollNo, String name, String dept, String section, int year) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }
    void display() {
        System.out.println("Rollno: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("Section: " + section);
        System.out.println("Year: " + year);
        System.out.println("-----------------"); 
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student(101, "Yash", "EEE", "A", 4);
        Student s2 = new Student(102, "Ranjith", "ECE", "B", 4);
        Student s3 = new Student(103, "Rajith", "CSE", "A", 4);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3; 
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
