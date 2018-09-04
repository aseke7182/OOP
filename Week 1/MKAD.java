import java.util.Scanner;

public class MKAD{
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int total = Math.abs(a*b);
        int ans = total % 109;
        if(a<0){
            ans = 109 - ans;
            ans = ans % 109;
        }
        System.out.print(ans);

    }
}