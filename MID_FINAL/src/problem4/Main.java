package problem4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Sequence s = new Sequence(reader.nextLine());
        Sequence s1 = new Sequence(reader.nextLine());
        if(s.isPalindrome()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        if(s.isSubString(s1)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
