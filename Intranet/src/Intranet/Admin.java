package Intranet;

public class Admin extends User {
    public Admin(){ super();}
    public Admin(String name, String surname, String id){ super(name,surname,id);}


    public void addStudent(String name,String surname, String faculty, String yearStudy, Double gpa){
        Student student = new Student(name,surname,faculty,yearStudy,gpa);
    }
    public void addTeacher(String name,String surname, String faculty,int salary, String id){
        Teacher teacher = new Teacher(name,surname,faculty,salary,id);
    }


    public void addORManager(String name, String surname,int salary, String id){
        ORManager orManager = new ORManager(name,surname,salary,id);
    }


    public void addTechSupportGuy(TechSupportGuy techSupportGuy){

    }
    public void removeStudent(String studentName){

    }
    public void updateUser(){}
    public void seeUserAction(){}
}
