import java.util.Scanner;

public class hyp{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        System.out.print(Math.sqrt(a*a+b*b));
    }
}