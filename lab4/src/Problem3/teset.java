package Problem3;

public class teset {
    public static void main(String [] args){
        Person x = new Manager("Pasha");
        Person y = new Manager();
        try {
            y = (Manager)x.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println(y.getName());
    }
}
