import java.util.Scanner;
public class Problem6{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        inWords a = new inWords(n);
        System.out.println(a.inWords(n));
    }
}