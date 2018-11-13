package Second;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    /*public String hash(String s){
        int prime = 31;
        ArrayList <Integer> p_pow = new ArrayList<>();
        p_pow.add(1);
        for(int i=1 ; i < 20 ; i++){
            p_pow.add(p_pow.get(i-1) * prime);
        }
        ArrayList <Integer> hs = new ArrayList<>();
        for (int i =0 ; i < 20 ; i++){

        }
        return s;
    }*/
    static public void main(String[] args) throws IOException {
        ArrayList<Course> courses = new ArrayList<>(); // We need to fill this fields, but I'm too lazy , sorry)
        ArrayList<Instructor> instructors = new ArrayList<>(); // Here is same problem
        ArrayList<TextBook> textBooks = new ArrayList<>(); // Yeah, you are right =)
        String login = "";
        String password = "";
        boolean ok = true;
        try {
            BufferedReader bq = new BufferedReader(new FileReader("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\Cources.txt"));
            BufferedReader be = new BufferedReader(new FileReader("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\Instructors.txt"));
            BufferedReader bt = new BufferedReader(new FileReader("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\TextBooks.txt"));
            String z = bq.readLine();
            int index = 0;
            while(z!=null){
                courses.add(index,new Course());
                z = bq.readLine();
                index++;
            }
            index =0;
            z = be.readLine();
            while (z!=null){
                instructors.add(index,new Instructor());
                z = be.readLine();
                index++;
            }
            index = 0;
            z = bt.readLine();
            while (z!=null){
                textBooks.add(index,new TextBook());
                z = bt.readLine();
                index++;
            }
        }catch (IOException ioe){
            System.out.println("AAAAA");
        }
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\admin.txt"));
            String line = bf.readLine();
            String admin = "";
            while(line != null){
                admin += line + " ";
                line = bf.readLine();
            }
            String [] ss = admin.split(" ");
            login = "root";//ss[1];
            password = "A2dz3vj12"; //ss[3];
            bf.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException FS){
            System.out.println("Something");
        }


        while(true){
            System.out.println(" Hello. \n You are Welcome to my Program \n Are you a Student(1) or Teacher(0)?");
            Scanner reader = new Scanner(System.in);
            int x = Integer.valueOf(reader.nextLine());
            if( x == 0 ){
                BufferedReader bzzz = null;
                BufferedWriter bw = null;
                try{
                    bzzz = new BufferedReader(new FileReader("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\AdminActions.txt"));
                    bw = new BufferedWriter(new FileWriter("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\AdminActions.txt"));
                }catch (IOException ioe){
                    System.out.println("IOE Exception");
                }
                while(true){
                    ok = false;
                    System.out.println("Please Write Login and Password \n .... \n Some Problems? Write Exit twice to exit from Admin mode");
                    String q = reader.nextLine();
                    String [] ss = q.split(" ");
                    String a = ss[0];
                    String b = ss[1];
                    if( a.equals( login )  && b.equals( password ) ){
                        DateFormat date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        String z = bzzz.readLine();
                        String action = "";
                        while(z!=null){
                            action += z;
                            z= bzzz.readLine();
                        } // Copy all Actions we did before
                        action += "\n" + date + "admin logged in to a system";
                        bw.write(action);
                        ok = true;
                        break;
                    }
                    if(a.equals( "exit" )  && b.equals("exit")){
                        break;
                    }
                }
                if(ok){
                    while(true){
                        System.out.println("Hello Admin. \n Now you could change some information ");
                        System.out.println("1)Add new Course \n 2) Add new TextBook \n If You want to exit, write '3'" );
                        int r = reader.nextInt();
                        if(r==3){
                            break;
                        }
                        else if(r == 1 ){
                            System.out.println("Write name of TextBook and CurseTitle");
                            String title = reader.nextLine();
                            TextBook t = new TextBook("title","title") ;
                            String c = reader.nextLine();
                            Instructor i = new Instructor(login,"","");
                            Course course = new Course(c,t,i);
                            System.out.println("Done");

                            DateFormat date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                            String z = bzzz.readLine();
                            String action = "";
                            while(z!=null){
                                action += z;
                                z= bzzz.readLine();
                            } // Copy all Actions we did before
                            action += "\n" + date + "admin added a new Course '" + title +"'";
                            bw.write(action);

                        }else if(r ==2 ) {
                            System.out.println("Write ISBN, title and Authors of TextBook");
                            String isbn = reader.nextLine();
                            String title = reader.nextLine();
                            String authors = reader.nextLine();
                            String[] au = authors.split(" ");
                            ArrayList<String> aut = new ArrayList<>();
                            for (int i = 0; i < au.length; i++) {
                                aut.add(au[i]);
                            }
                            TextBook textBook = new TextBook(isbn, title, aut);
                            System.out.println("Done");

                            DateFormat date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                            String z = bzzz.readLine();
                            String action = "";
                            while (z != null) {
                                action += z;
                                z = bzzz.readLine();
                            } // Copy all Actions we did before
                            action += "\n" + date + "admin added a new textbook '" + title + "'";
                            bw.write(action);
                        }
                    }
                }
                bzzz.close();
                bw.close();
            }else{
                while(true){
                    System.out.println("Nice. Now You Are User \n  Here is some choices that you could do: \n 1)List of Courses \n 2)Course that You interested in \n Please Enter the number " );
                    int q = reader.nextInt();
                    if(q==1){
                        for (int i=0 ; i< courses.size(); i++){
                            System.out.println(courses.get(i).getCourseTitle());
                        }
                        System.out.println("That's all. Thanks for watching. \n Now Press Enter to see something else");
                    }else if(q == 2){
                        boolean go = true;
                        while(go) {
                            System.out.println("Now Please Write without mistakes a name of a course that you interested in");
                            String s = reader.nextLine();
                            for (int i=0 ; i < courses.size() ; i++){
                                if(courses.get(i).getCourseTitle() == s){
                                    System.out.println(courses.get(i).toString());
                                    System.out.println("I hope You Enjoyed with this information");
                                    go = false;
                                    break;
                                }
                            }
                            System.out.println("Sorry, But I couldn't found any course by your request");
                            System.out.println("If you need to exit wrote 'exit' or something else to try one more time");
                            String w = reader.nextLine();
                            if(w.equals("exit")){
                                go = false;
                            }
                        }
                    }
                    System.out.println("Press something to exit");
                    reader.nextInt();
                    break;
                }
            }
            break;
        }
        try {
            BufferedWriter cou = new BufferedWriter(new FileWriter("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\Cources.txt"));
            BufferedWriter ins = new BufferedWriter(new FileWriter("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\Instructors.txt"));
            BufferedWriter text = new BufferedWriter(new FileWriter("C:\\Users\\Aseke\\Desktop\\KBTU\\III semester\\OOP\\Lab Works\\Lab5\\src\\Second\\TextBooks.txt"));
            cou.write(courses.toString());
            ins.write(instructors.toString());
            text.write(textBooks.toString());
            cou.close();
            ins.close();
            text.close();
        }catch (IOException is){
            System.out.println("AAAAA");
        }
    }
}