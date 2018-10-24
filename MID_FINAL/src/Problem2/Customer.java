package Problem2;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    public Customer(String name1){
        name = name1;
    }
    public  String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean member1){
        member1 = member;
    }
    public String getMemberType(){
        return memberType;
    }
    public void  setMemberType(String type){
        memberType = type;
    }
    public String toString(){
        return "name: " + getName() + " Member Type: " + memberType + " IsMember: " + member;
    }
}
