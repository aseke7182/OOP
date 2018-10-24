package Problem1;

import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Sequence s = new Sequence(reader.nextLine());
        Sequence s1 = new Sequence(reader.nextLine());
        System.out.println(s.isPalindrome());
        System.out.println(s.isSubString(s1));
    }
}
