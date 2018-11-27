package Intranet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Admin extends User {
    public Admin(){ super();}
    public Admin(String name, String surname, String id){ super(name,surname,id);}


    public void addStudent(String name,String surname, String faculty,String id , String yearStudy, Double gpa){
        Student student = new Student(name,surname,faculty,id,yearStudy,gpa);
        Runner.students.add(student);
    }
    public void addTeacher(String name,String surname, String faculty,int salary, String id){
        Teacher teacher = new Teacher(name,surname,faculty,salary,id);
        Runner.teachers.add(teacher);
    }


    public void addORManager(String name, String surname,int salary, String id){
        ORManager orManager = new ORManager(name,surname,salary,id);
        Runner.orManagers.add(orManager);
    }


    public void addTechSupportGuy(String name , String surname , int salary, String id , String order){
        TechSupportGuy techSupportGuy1 = new TechSupportGuy(name,surname,salary,id,order);
        Runner.techSupportGuys.add(techSupportGuy1);
    }

    public String actions(){
        String  s = "1) List of Students \n";
        s += "2) List of Teachers \n";
        s += "3) List of TeachSupportGuys\n";
        s += "4) List of ORmanagrs\n";
        s += "5) Add Teacher\n";
        s += "6) Add Student \n";
        s += "7) Add ORManager \n";
        s += "8) Add TechSupportGuy\n" ;
        s += "9) Remove Teacher\n";
        s += "10) Remove Student\n";
        s += "11) Remove ORmanager\n";
        s += "12) Remove TechSupportGuy \n";
        s += "13) See all actions \n";
        return s;
    }
    public void updateUser(){}
    public String seeUserAction(){
        String ss = "";
        try {
            BufferedReader bf = new BufferedReader( new FileReader("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\Actions.txt"));
            String s = bf.readLine();
            while(s!=null){
                ss += s + "\n";
                s = bf.readLine();
            }
            bf.close();
        }catch (FileNotFoundException FFE){
            System.out.println("File Not Found");
        }catch (IOException IOE){
            System.out.println("ad");
        }
        return ss;
    }
}
