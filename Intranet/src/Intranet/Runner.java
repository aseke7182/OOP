package Intranet;


import javax.swing.plaf.synth.SynthToolTipUI;
import java.io.*;
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
         Serialization();
         while(true) {
             System.out.println("Hello My Dear Friend");
             System.out.println("How would you enter to the system?");
             System.out.println("1) Admin");
             System.out.println("2) Teacher");
             System.out.println("3) Student");
             System.out.println("0) Exit");
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
                 while (true){
                     System.out.println("Now you try to enter like a teacher. Good Luck");
                     System.out.println("Enter Your ID and Password");
                     System.out.println("If you want to exit write Q");
                     String id = reader.next();
                     if(id.equals("Q")){
                         break;
                     }
                     String pass = reader.next();
                     for (int i=0 ; i < teachers.size() ; i++){
                         if(teachers.get(i).getId().equals(id) && teachers.get(i).getFaculty().equals(pass)){
                             System.out.println("Wow, You Entered Like a teacher.");
                             System.out.println("My congratulations");
                             while (true){
                                 teachers.get(i).actions();
                                 String s = reader.next();
                                 if(s.equals("Q")){break;}
                                 if(s.equals("1")){
                                     while (true){
                                         for(int j=0 ; j < teachers.get(i).getCourse().size(); j++){
                                             System.out.println(teachers.get(i).getCourse().get(j).toString());
                                         }
                                         System.out.println("choose your course by counting from 0");
                                         System.out.println("\n Now if you want see course's student or Course file write 1 or 2 respectively");
                                         System.out.println("Now if you want to exit write Q");
                                         int z = reader.nextInt();
                                         String  w = reader.next();
                                         if(w.equals("Q")){break;}
                                         if(w.equals("1")){
                                             teachers.get(i).getCourse().get(z).getStudentList().toString();
                                         }
                                         if(w.equals("2")){
                                             teachers.get(i).getCourse().get(z).getCourseFile().toString();
                                         }
                                     }
                                 }
                                 if(s.equals("2")){
                                     System.out.println("Add some course");
                                     System.out.println("Write String title,String id, String faculty , int credits");
                                     String title = reader.next();
                                     String idwka = reader.next();
                                     String faculty = reader.next();
                                     int credits = reader.nextInt();
                                     Course c = new Course(title,idwka,faculty,credits);
                                     teachers.get(i).addCourse(c);
                                 }
                                 if(s.equals("3")){
                                     System.out.println("If you want delete some course just write me its title");
                                     String q = reader.next();
                                     for (int j =0  ; j < teachers.get(i).getCourse().size(); j++){
                                         if(teachers.get(i).getCourse().get(j).getTitle().equals(q)){
                                             teachers.get(i).getCourse().remove(j);
                                             System.out.println("Well Done , Now please exit from here because i do not enough time to complete these task to finally");
                                         }
                                     }
                                 }
                                 if(s.equals("4")){
                                     System.out.println("Write me ID of student that you want to check");
                                     String sdudent = reader.next();
                                     for (int k=0 ; k < students.size(); k ++){
                                         if(students.get(k).getId().equals(sdudent)){
                                             System.out.println(teachers.get(0).informationAboutStudent(students.get(k)));
                                         }
                                     }
                                 }
                                 if(s.equals("5")){
                                     System.out.println("Write me ID and mark that you want to stavit and course to this student");
                                     String sdudent = reader.next();
                                     int b = reader.nextInt();
                                     for(int k=0 ; k < students.size(); k ++){
                                         if(students.get(k).getId().equals(sdudent)){
                                             students.get(k).setStudentCourseMark(new Course() , new Mark(b));
                                         }
                                     }
                                 }
                                 if(s.equals("7")){
                                     System.out.println("Send some request");
                                     System.out.println("Write Text and Support guy id");

                                 }
                             }
                             break;
                         }
                     }
                     System.out.println("Noo luck, try one more time \n");
                 }
             }else if( a == 3 ){

             }else if( a == 0 ){
                 break;
             }

         }
         Deserialization();
    }
    public static void Deserialization(){
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\Teachers.ser"));
            oot.writeObject(teachers);
            oot.flush();
            oot.close();
            ObjectOutputStream oot1 = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\Students.ser"));
            oot1.writeObject(students);
            oot1.flush();
            oot1.close();
            ObjectOutputStream oot2 = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\orManagers.ser"));
            oot2.writeObject(orManagers);
            oot2.flush();
            oot2.close();
            ObjectOutputStream oot3 = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\techSupportGuys.ser"));
            oot3.writeObject(techSupportGuys);
            oot3.flush();
            oot3.close();

        }catch (IOException ioe){
            System.out.println("SSSS");
        }
    }
    public static void  Serialization(){
        try {
            FileOutputStream teachers1 = new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\Teachers.ser");
            ObjectOutputStream out  = new ObjectOutputStream(teachers1);
            out.writeObject(teachers);
            out.close();
            teachers1.close();
            FileOutputStream students1 = new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\Students.ser");
            ObjectOutputStream out1 = new ObjectOutputStream(students1);
            out1.writeObject(students);
            out1.close();
            students1.close();
            FileOutputStream tech = new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\TechSupportGuys.ser");
            ObjectOutputStream out2 = new ObjectOutputStream(tech);
            out2.writeObject(techSupportGuys);
            out2.close();
            tech.close();
            FileOutputStream ormanagers = new FileOutputStream("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Intranet\\src\\Intranet\\orManagers.ser");
            ObjectOutputStream out3 = new ObjectOutputStream(ormanagers);
            out3.writeObject(orManagers);
            out3.close();
            ormanagers.close();
        }catch (IOException ioe){
            System.out.println("Some Problem, Please check it, Thanks");
        }
    }
}
