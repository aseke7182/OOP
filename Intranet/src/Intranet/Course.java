package Intranet;


import java.util.ArrayList;

public class Course {
    private boolean register;
    private CourseFile courseFile;
    private Mark mark;
    private String title;
    private String id;
    private String faculty;
    ArrayList <Student> studentslist;
    private int credits;
    public Course(){}
    public Course(String title,String id, String faculty , int credits){
        this.title = title;
        this.id = id;
        this.faculty = faculty;
        this.credits = credits;
        studentslist = new ArrayList<>();
    }
    public CourseFile getCourseFile(){
        return courseFile;
    }
    public ArrayList<Student> getStudentList(){
        return  studentslist;
    }
    public void setMark(Mark mark){
        this.mark = mark;
    }
    public Mark getMark(){
        return mark;
    }
    public void clear(){
        this.register = false;
        this.title = "";
        this.id = "";
        this.faculty = "";
        this.credits = 0;
    }
    public String getTitle(){
        return title;
    }


    public boolean equals(Object o){
        Course c = (Course) o;
        if( c.register == this.register && c.courseFile.equals(this.courseFile) && c.mark.equals(this.mark)) return true;
        return false;
    }
}
