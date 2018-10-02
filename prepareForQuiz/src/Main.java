import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        Character[] a  = sss(s);
        for(int i=0; i<a.length ; i++){
            System.out.print(Character.toString(a[i]) + ' ');
        }
    }
    public static Character[] sss(String s){
        Character[] ss = new Character[s.length()];
        for (int i = 0; i < s.length() ; i++){
            ss[i] = s.charAt(i);
        }
        return ss;
    }
}