package Intranet;

import java.util.Map;

public class CourseFile {
    private String file;
    private String name;
    public CourseFile(String file,String name){
        this.file = file;
        this.name = name;
    }
    public void  setFile(String file){
        this.file = file;
    }
    public String getFile(){ return file;}
    public void setName(String  name) { this.name = name;}
    public String getName(){ return name;}
}
