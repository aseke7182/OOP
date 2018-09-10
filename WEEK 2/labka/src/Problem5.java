import java.util.Scanner;
public class Problem5{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Repeater repeater = new Repeater();
        int n = reader.nextInt();
        int[] a;
        a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = reader.nextInt();
        }
        a = repeater.repeat(a);
        for(int i=0; i<a.length ; i++){
            System.out.print(a[i] + " ");
        }
    }
}