import java.util.Scanner;
public class Problem4{
    public  static void main(String[] args){
        Scanner reader  =  new Scanner(System.in);
        int hour = reader.nextInt();
        int minute = reader.nextInt();
        int second = reader.nextInt();
        Time t = new Time(hour, minute, second);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandart());
        Time t2 = new Time(4,23,33);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandart());
    }
}