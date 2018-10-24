package Lab3Problem4;

public class Person {
    private String name;
    public Person(){
        name = "no name";
    }
    public Person(String _name){
        name = _name;
    }
    public void setName(String  newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
}
