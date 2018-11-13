package Intranet;

public class ORManager extends Employee {
    private String name;
    private String surname;
    public ORManager(){super();}
    public ORManager(String name, String surname,int salary,String id){
        super(name,surname,salary,id);
    }

    public void addCourse(Student student, Course course ){
        if(student.register.containsValue(course)) student.studentCourseMark.put(course,null);
    }
    public void sendOrderToGuy(TechSupportGuy techSupportGuy,String order){
        techSupportGuy.setOrder(order);
    }
    public void deleteCourse(Course course){
        for (int i=0 ; i < Runner.courses.size(); i++){
            if(Runner.courses.get(i).equals(course)){
                Runner.courses.get(i).clear();
            }
        }
    }
    public void sendMessage(Teacher teacher,String message){
        teacher.setMessage(message);
    }
    public void addCourse(Course course){
        Runner.courses.add(course);
    }
    public void manageMark(Student student, Course course , Mark mark){
        student.studentCourseMark.replace(course,mark);
    }

}
