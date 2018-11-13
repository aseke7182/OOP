package First;
import java.io.*;
public class main{
    public static void main (String[] args) {
        int max = 0;
        int min = 100;
        int avg = 0;
        String s = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\First\\scorer.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\First\\grades.txt"));
            String line = br.readLine();
            while(line!=null) {
                String[] ss = line.split(" ");
                if (Integer.valueOf(ss[2]) > max){
                    max = Integer.valueOf(ss[2]);
                }
                if(Integer.valueOf(ss[2]) < min ){
                    min = Integer.valueOf(ss[2]);
                }
                s += line + " ";
                line = br.readLine();
            }
            String ss1[] = s.split(" ");
            String a = "";
            for (int i=0 ; i < ss1.length ; i++){
                int x ;
                if( (i+1) % 3 == 0){
                    x = i;
                    avg += Integer.valueOf(ss1[x]);
                    if( (max - 10) <= Integer.valueOf(ss1[x])){
                        ss1[x] =  "A";
                    }else if( (max - 20) <= Integer.valueOf(ss1[x])){
                        ss1[x] = "B";
                    }else if((max - 30) <= Integer.valueOf(ss1[x])){
                        ss1[x] = "C";
                    }else if((max - 40) <= Integer.valueOf(ss1[x])){
                        ss1[x] = "D";
                    }else {
                        ss1[x] = "F";
                    }
                    a += ss1[i];
                    a += "\n";
                    continue;
                }
                a += ss1[i] + " ";
            }
            avg = avg / (ss1.length/3);
            a += "\n" + "Average - " + avg + "\n";
            a += "Maximum: " + max + "\n";
            a += "Minimum: " + min + "\n";
            bw.write(a);
            bw.close();
            br.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not found: ");
        } catch (IOException ioe){
            System.out.println("Can't read from file: " );
        }
    }
}
