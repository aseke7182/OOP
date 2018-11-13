package Intranet;

public abstract class User {
    protected String name;
    protected String id;
    protected String surname;
    protected String faculty;
    public User(){ }
    public User(String name, String surname,String id){
        this.name = name;
        this.id = id;
        this.surname =  surname;
    }
    public User(String name, String surname, String faculty,String id){
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.id = id;
    }
    public void setId(String id){ this.id = id;}
    public void setName(String name){ this.name = name; }
    public void setSurname(String surname ){ this.surname = surname;}
    public void setFaculty(String faculty){ this.faculty = faculty;}
    public String getName(){ return name;}
    public String getId() {return id;}
    public String getSurname(){ return surname;}
    public String getFaculty() { return  faculty;}
    public String toString(){ return  name + " " + surname + " " + faculty + "\n";}
    public boolean equals(Object o){
        User user  = ( User) o ;
        if(user.faculty.equals(this.faculty) && user.surname.equals(this.surname) && user.name.equals(this.name)) return  true;
        return false;
    }
}
