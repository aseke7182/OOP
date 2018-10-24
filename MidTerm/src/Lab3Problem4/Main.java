package Lab3Problem4;

public class Main {
    public static void printInformation(Person p){
        p.getName();
    }
    public static void main(String[] args){
        Student student = new Student("Sergey");
        Empolyee empolyee = new Empolyee("Andrey");
        Person person = student;
        String s = person.getName();
        System.out.println(s);

        person = empolyee;
        s = person.getName();
        System.out.println(s);

        printInformation(student);
        printInformation(empolyee);
    }
}
