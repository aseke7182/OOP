package Lab3Problem4;

public class Student extends Person {
    public Student(){
        super();
    }
    public Student(String _name){
        super(_name);
    }
    public String getName(){
        System.out.println("Student Name: " + super.getName());
        return super.getName();
    }
}
