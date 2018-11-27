package Intranet;

import java.util.ArrayList;

public class Teacher extends Employee {
    private ArrayList<Course> course;
    private Zvanie zvanie;
    private String message;
    public Teacher(){
        super();
        zvanie = Zvanie.Assitent;
    }
    public Teacher(String name, String surname, String faculty,int salary, String id){
        super(name,surname,faculty,salary,id);
        zvanie = Zvanie.justTeacher;
        course = new ArrayList<>();
    }

    public String viewCourse(){
        String s="";
        for (int i=0;  i< course.size() ; i++){
            s+= course.get(i).toString();
        }
        return s;
    }
    public void deleteCourse(Course course){
        for (int i=0 ; i < this.course.size(); i++){
            if(this.course.get(i).equals(course)){
                this.course.get(i).clear();
            }
        }
    }
    public void addCourse(Course course){
        this.course.add(course);
    }
    public void manageMark(Student student, Course course , Mark mark){
        student.studentCourseMark.replace(course,mark);
    }
    public void manageCourseFile(CourseFile courseFile, String file){
        courseFile.setFile(file);
    }
    public void addCourseFile(String file,String name){
        CourseFile courseFile = new CourseFile(file,name);
    }
    public void deleteCourseFile(String name){
        for (int i=0 ; i < Runner.courseFiles.size() ; i++){
            if(Runner.courseFiles.get(i).getName().equals(name)){
                Runner.courseFiles.get(i).setFile("");
                Runner.courseFiles.get(i).setName("");
            }
        }
    }
    public String informationAboutStudent(Student student){
        for (int i=0 ; i< Runner.students.size() ; i++){
            if(Runner.students.get(i).equals(student)){
                return Runner.students.get(i).toString();
            }
        }
        return "Not Found";
    }
    public void sendOrderToGuy(TechSupportGuy techSupportGuy,String order){
        techSupportGuy.setOrder(order);
    }
    public ArrayList<Course> getCourse(){ return course;}
    public void setMessage(String message){
        this.message+=message;
    }
    public String getMessage(){ return message;}

    public String actions(){
        String s = "";
        s += "1) See Your courses \n" ;
        s += "2) Add course \n";
        s += "3) Delete course \n";
        s += "4) Exit - Q \n";
        s += "5) See information about all students\n";
        s += "6) Add some marks to some Student that you want\n";
        s += "7) Send some request to our supporter\n";
        return s;
    }
}
