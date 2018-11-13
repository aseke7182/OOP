package Intranet;

public abstract class Employee extends User {
    protected int salary;
    public Employee(){}
    public Employee(String name,String surname,int salary,String id){
        super(name,surname,id);
        this.salary = salary;
    }
    public Employee(String name, String surname, String faculty,int salary,String id){
        super(name,surname,faculty,id);
        this.salary = salary;
    }
    public int getSalary(){ return salary;}
    public void setSalary(int salary){ this.salary = salary; }
    public String toString(){
        return getName() + " " + getSurname() + " " + getSalary() + "\n";
    }
    public boolean equals(Object o){
        Employee e = (Employee) o;
        if(getName().equals(e.getName()) && getSurname().equals(e.getSurname())) return true;
        return false;
    }
}
