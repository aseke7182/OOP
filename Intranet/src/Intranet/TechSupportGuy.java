package Intranet;


public class TechSupportGuy extends Employee {
    private String order;
    public TechSupportGuy(){ super(); }
    public TechSupportGuy(String name, String surname,int salary,String id,String order){
        super(name,surname,salary,id);
        this.order = order;
    }
    public void setOrder(String order){
        this.order+= order;
    }
    public String getOrder(){
        return order;
    }
}
