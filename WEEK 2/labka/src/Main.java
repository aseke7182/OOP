import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a = reader.nextLine();
        int id = reader.nextInt();
        Student student1 = new Student( a , id);
        student1.NextYear();
        student1.ChangeId(6);
        student1.ChangeName("Aseke");
        String res  = "";
        res += student1.name + " ";
        res += student1.id + " ";
        res += student1.year_of_study;
        System.out.println(res);
    }
}

