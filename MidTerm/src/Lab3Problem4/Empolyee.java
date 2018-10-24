package Lab3Problem4;

public class Empolyee extends Person {
    public Empolyee(){
        super();
    }
    public Empolyee(String name){
        super(name);
    }
    public String getName(){
        System.out.println("Employee Name: " + super.getName());
        return super.getName();
    }
}
