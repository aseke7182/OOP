package Second;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;

public class TextBook {
    private String ISBN;
    private String title;
    private ArrayList <String> authors = new ArrayList<>();

    public TextBook(){}
    public TextBook(String ISBN, String title){
        this.ISBN = ISBN;
        this.title  = title;
    }
    public TextBook (String ISBN, String title, ArrayList<String> authors){
        this.authors = authors;
        this.ISBN = ISBN;
        this.title = title;
    }
    public void setISBN(String ISBN){
        this.ISBN =ISBN;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthors(ArrayList<String>  a){
        authors = a;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public ArrayList<String> getAuthors(){
        return authors;
    }
    public String toString(){
        String s = "Authors: ";
        for(String a: authors){
            s+= a + " ";
        }
        s+= "\nISBN: " + getISBN();
        s+= "\nTitle: " + getTitle();
        return s;
    }
    public boolean equals(Object o){
        TextBook t = (TextBook) o;
        if(t.ISBN == this.ISBN && t.title==this.title) return true;
        return  false;
    }
}
