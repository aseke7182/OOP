package Second;

import sun.plugin.dom.core.CoreConstants;

import java.util.Date;

public class Course {
    private TextBook TextBook ;
    private Instructor Instructor;
    private String CourseTitle;
    public Course(){}
    public Course(String a, TextBook b , Instructor c){
        CourseTitle = a ;
        TextBook = b;
        Instructor = c;
    }
    public void setTextBook(TextBook t){
        TextBook = t;
    }
    public void setInstructor(Instructor i){
        Instructor = i;
    }
    public void setCourseTitle(String  s){
        CourseTitle  = s;
    }
    public String  getCourseTitle(){
        return CourseTitle;
    }
    public TextBook getTextBook(){
        return TextBook;
    }
    public Instructor getInstructor(){
        return Instructor;
    }
    public String toString(){
        String  s = "";
        s += "Instructor: " + Instructor.toString() + "\n";
        s += "TextBook " + TextBook.toString() + "\n";
        s += "CourseTitle: " + getCourseTitle();
        return s;
    }
    public boolean equals(Object o){
        Course c = (Course) o;
        if(TextBook.equals(c.TextBook) && Instructor.equals(c.Instructor) && this.CourseTitle == c.CourseTitle) return true;
        return false;
    }

}
