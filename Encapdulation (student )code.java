class Student{
    int rollno;
    String name;
    private String dept;
    private String section;
    int year;
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getSection(){
        return section;
    }
    public void setSection(String section){
        this.section=section;
    }
    Student(int rollno,String name,String dept,String section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
        System.out.println("dept:"+dept);
        System.out.println("section:"+section);
        System.out.println("yera:"+year);
        System.out.println();
    }
}
public class Main{
    public static void main(String[]args){
        Student[]Student=new Student[3];
        Student s1=new Student(101,"Yash","EEE","A",4);
        Student[0]=s1;
        Student s2=new Student(102,"Rajith","CSE","B",4);
        Student[1]=s2;
        Student[2]=new Student(103,"Madhan","IT","A",4);
        Student[1].setSection("C");
        Student[1].setDept("ECE");
        for(int i=0;i<Student.length;i++){
            Student[i].display();
        }
    }
}
