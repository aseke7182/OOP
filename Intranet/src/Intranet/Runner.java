package Intranet;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static ArrayList<Student> students;
    public static ArrayList<Admin> admins;
    public static ArrayList<Teacher> teachers;
    public static ArrayList<ORManager> orManagers;
    public static ArrayList<Course> courses;
    public static ArrayList<CourseFile> courseFiles;
    public static ArrayList<TechSupportGuy> techSupportGuys;
    static public void main(String[] args){
         Scanner reader = new Scanner(System.in);
         Admin admin = new Admin("KBTUadmin!", "administator",  "7182");
        // admins.add(admin);
         students = new ArrayList<>();
         admins = new ArrayList<>();
         teachers = new ArrayList<>();
         orManagers = new ArrayList<>();
         teachers = new ArrayList<>();
         courses = new ArrayList<>();
         courseFiles = new ArrayList<>();
         techSupportGuys = new ArrayList<>();
         while(true) {
             System.out.println("Hello My Dear Friend");
             System.out.println("How would you enter to the system?");
             System.out.println("1) Admin");
             System.out.println("2) Teacher");
             System.out.println("3) Student");
             int a = reader.nextInt();
             if( a==1 ){
                 while (true){
                     System.out.println("Please, Enter the name and password ");
                     String name = reader.next();
                     String password = reader.next();
                     if(name.equals( "KBTUadmin!") && password.equals("administrator")){
                         while (true){
                             System.out.println(admin.actions());
                             int number = reader.nextInt();
                             if( number == 1 ){
                                 for (int i=0 ; i < students.size(); i++){
                                     System.out.println(students.get(i).toString());
                                 }
                                 System.out.println("Press any button to continue");
                             }else if(number == 2){
                                 for (int i=0 ; i < teachers.size(); i ++){
                                     System.out.println(teachers.get(i).toString());
                                 }
                                 System.out.println("Press any button to continue");
                             }else if(number == 3){
                                 for (int i=0 ; i < techSupportGuys.size() ; i++){
                                     System.out.println(techSupportGuys.get(i).toString());
                                 }
                                 System.out.println("Press any button to continue");
                             }
                             else if(number == 4 ){
                                 for (int i=0 ; i < orManagers.size() ; i++ ){
                                     System.out.println(orManagers.get(i).toString());
                                 }
                                 System.out.println("Press any button to continue");
                             }else if( number == 5){
                                 System.out.println("Name,Surname,faculty,salary,id");
                                 String teachername = reader.next();
                                 String  teachersurname = reader.next();
                                 String teacherfaculty = reader.next();
                                 int teachersalary = reader.nextInt();
                                 String teacherid = reader.next();
                                 Teacher teacher = new Teacher(teachername,teachersurname,teacherfaculty,teachersalary,teacherid);
                                 teachers.add(teacher);
                                 System.out.println("Press any button to continue");
                             }else if( number == 6 ){
                                 System.out.println("Name,Surname,faculty,id,YearStudy,Gpa\n");
                                 String studentname = reader.next();
                                 String  studentsurname = reader.next();
                                 String studentfaculty = reader.next();
                                 String studentid = reader.next();
                                 String studentYearstude = reader.next();
                                 Double studentgpa = reader.nextDouble();
                                 Student student = new Student(studentname,studentsurname,studentfaculty,studentid,studentfaculty,studentgpa);
                                 students.add(student);
                                 System.out.println("Press any button to continue\n");
                             }else if( number == 7 ){
                                 System.out.println("name, surname,salary,id\n");
                                 String orname = reader.next();
                                 String  orsurname = reader.next();
                                 int orsalary = reader.nextInt();
                                 String orid = reader.next();
                                 ORManager orManager = new ORManager(orname,orsurname, orsalary,orid);
                                 orManagers.add(orManager);
                                 System.out.println("Press any button to continue\n");
                             }else if(number==8){
                                 System.out.println(" name, surname,salary,id,order\n");
                                 String supporttname = reader.next();
                                 String supportsurname = reader.next();
                                 int supportsalary = reader.nextInt();
                                 String supportid = reader.next();
                                 String supportorder = reader.next();
                                 TechSupportGuy techSupportGuy = new TechSupportGuy(supportsurname,supportsurname,supportsalary,supportid,supportorder);
                                 techSupportGuys.add(techSupportGuy);
                                 System.out.println("Press any button to continue\n");
                             }else if(number == 9){
                                 while(true){
                                     for (int i=0 ; i < teachers.size(); i ++){
                                         System.out.println(teachers.get(i).toString());
                                     }
                                     System.out.println("Choose Teacher that you want to delete ( 0 to exit) \n");
                                     int next = reader.nextInt();
                                     if(next == 0){
                                         break;
                                     }
                                     teachers.remove(next);
                                     System.out.println("Done\n");
                                 }
                             }else if(number==10){
                                 while (true){
                                     for (int i=0 ; i < students.size(); i++){
                                         System.out.println(students.get(i).toString());
                                     }
                                     System.out.println("Choose Student that you want to delete ( 0 to exit) \n");
                                     int next = reader.nextInt();
                                     if(next == 0){
                                         break;
                                     }
                                     students.remove(next);
                                     System.out.println("Done\n");
                                 }
                             }else if(number==11){
                                 while (true){
                                     for (int i=0 ; i < orManagers.size() ; i++ ){
                                         System.out.println(orManagers.get(i).toString());
                                     }
                                     System.out.println("Choose ORmanager that you want to delete ( 0 to exit) \n");
                                     int next = reader.nextInt();
                                     if(next == 0){
                                         break;
                                     }
                                     orManagers.remove(next);
                                     System.out.println("Done\n");
                                 }
                             }else if(number == 12 ){
                                 while (true){
                                     for (int i=0 ; i < techSupportGuys.size() ; i++){
                                         System.out.println(techSupportGuys.get(i).toString());
                                     }
                                     System.out.println("Choose TechSupportGuy that you want to delete ( 0 to exit) \n");
                                     int next = reader.nextInt();
                                     if(next == 0){
                                         break;
                                     }
                                     techSupportGuys.remove(next);
                                     System.out.println("Done\n");
                                 }
                             }else if(number == 13){
                                 System.out.println(admin.seeUserAction());
                             }
                             System.out.println("Write exit to exit or something another to continue\n");
                             String go = reader.next();
                             if(go.equals("exit")){
                                 break;
                             }
                         }
                     }else if( name.equals("exit") && password.equals("exit") ){
                         break;
                     } else{
                         System.out.println("Try one more time or write exit");
                     }
                 }
             }else if( a == 2){

             }else if( a == 3 ){

             }
         }
    }
}
