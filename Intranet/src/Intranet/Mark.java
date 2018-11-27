package Intranet;


public class Mark {
    private int mark;
    public Mark(){ }
    public Mark( int mark){
        this.mark = mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public int getMark(){
        return mark;
    }
    public boolean equals(Object o){
        Mark mark = (Mark) o ;
        if( mark.getMark() == this.mark) return  true;
        return false;
    }
    public String toString(){
        String s = getMark() + " ";
        return s ;
    }
}
