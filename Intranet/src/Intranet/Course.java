package Intranet;

import java.util.Map;

public class Course {
    private boolean register;
    private CourseFile courseFile;
    private Mark mark;
    private String title;
    private String id;
    private String faculty;
    private int credits;
    public Course(){}
    public Course(String title,String id, String faculty , int credits){
        this.title = title;
        this.id = id;
        this.faculty = faculty;
        this.credits = credits;
    }
    public CourseFile getCourseFile(){
        return courseFile;
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


    public boolean equals(Object o){
        Course c = (Course) o;
        if( c.register == this.register && c.courseFile.equals(this.courseFile) && c.mark.equals(this.mark)) return true;
        return false;
    }
}
