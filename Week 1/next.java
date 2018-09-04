import java.util.Scanner;

public class next{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = a+1;
        int c = a-1;
        System.out.println("The next number for the number "+a+" is " + b+".");
        System.out.println("The previous number for the number "+a+" is " + c+".");

    }
}