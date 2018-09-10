import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner reader =  new Scanner(System.in);
        int width = reader.nextInt();
        StarTriangle small =  new StarTriangle(width);
        System.out.println(small.toString());
    }
}