package Second;

import java.io.FileReader;

public class Instructor {
    private String FirstName;
    private String LastName;
    private String email;
    public Instructor(){}
    public Instructor(String name,String last,String mail){
        FirstName = name;
        LastName = last;
        email = mail;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getEmail(){
        return email;
    }
    public void setFirstName(String a){
        this.FirstName = a;
    }
    public void setLastName(String  a){
        this.LastName = a;
    }
    public void setEmail(String a){
        this.email = email;
    }
    public String toString(){
        String s = "First Name:" + FirstName + "\n";
        s += "Last Name: " + LastName + "\n";
        s += "Email: " + email + "\n";
        return s;
    }
    public boolean equals(Object o){
        Instructor i = (Instructor) o;
        if(i.email == this.email && i.LastName == this.LastName && i.FirstName == this.FirstName) return  true;
        return  false;
    }
}
