package Intranet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student extends User {
    private String yearStudy;
    private double gpa;
    public Map<Course,Mark> studentCourseMark;
    public Map<Course,Boolean> register;

    public Student(){super();}
    public Student(String name, String surname, String id,String faculty, String YearStudy, Double gpa){
        super(name,surname,id);
        this.gpa = gpa;
        this.faculty = faculty;
        this.yearStudy = YearStudy;
        studentCourseMark = new HashMap<>();
        register = new HashMap<>();
    }

    public void registerForCourse(Course course){
        register.put(course,true);
    }
    public CourseFile  viewCourseFiles(Course course){
        return course.getCourseFile();
    }
    public String  InfAboutTeacherCourse(Course course){
        for (int i=0 ; i < Runner.teachers.size() ; i++){
            for (int j=0 ; j < Runner.teachers.get(i).getCourse().size() ; j ++){
                if(Runner.teachers.get(i).getCourse().get(j).equals(course)){
                    return Runner.teachers.get(i).toString();
                }
            }
        }
        return "Not Found";
    }
    public String CourseMarks(Course course){
        for (int i=0 ; i< Runner.courses.size() ; i++){
            if(Runner.courses.get(i).equals(course)){
                return  Runner.courses.get(i).getMark().toString();
            }
        }
        return "Not Found";
    }
    public String  transcript(){
        String transcripter = "";
        Iterator it = this.studentCourseMark.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            transcripter +=pair.getKey() + " " + pair.getValue();
        }
        return transcripter;
    }
    public String getYearStudy(){ return  yearStudy;}
    public void setYearStudy(String yearStudy){ this.yearStudy = yearStudy;}
    public double getGpa(){ return  gpa;}
    public void setStudentCourseMark(Course c , Mark mark){
        Iterator it = this.studentCourseMark.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if(c.equals(it)){
                c.setMark(mark);
            }
        }
    }
    public void setGpa(double gpa){ this.gpa = gpa;}
    public String toString(){
        String s = " " + getName();
        s += " " + getSurname();
        s += " " + getFaculty();
        s += " " + getYearStudy();
        s += " " + getId();
        s += " " + getGpa();
        return  s ;
    }
}
