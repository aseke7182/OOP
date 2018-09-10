import  java.util.Scanner;
public class Problem3{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String numb;
        Data data = new Data();
        Analyzer az = new Analyzer();
        while(true){
            System.out.println("Enter number (Q to quit):");
            numb = reader.nextLine();
            if(numb.equals("Q")){
                break;
            }
            double s = Double.parseDouble(numb);
            data.Adder(s);
        }
        System.out.println("Average = " + az.Compare(data));
        System.out.println("Maximum = " + az.max(data));

    }
}