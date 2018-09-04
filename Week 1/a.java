import java.util.Scanner;
public class a{
    public static int Xor(int a, int b){
        if(a!=b){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.print(Xor(a,b));
    }
}