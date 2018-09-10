public class Student {
    public String name;
    public int id;
    public int year_of_study = 1 ;
    public Student(String NewName, int NewId){
        name =  NewName;
        id = NewId;
    }
    public void NextYear(){
        year_of_study++;
    }
    public void ChangeName(String NewName){
        name = NewName;
    }
    public void ChangeId(int NewId){
        id = NewId;
    }


}
