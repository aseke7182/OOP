public class Time {
    public int hour;
    public int minute;
    public int second;
    public  Time(int hour, int minute, int second){
        this.hour = hour % 24 + (minute * 60 + second)/3600;
        this.minute = minute % 60 + second /60;
        this.second = second % 60;
    }
    public String toUniversal(){
        String s;
        if(hour<10){
            s ="0" + Integer.toString(hour);
        }else {
            s = Integer.toString(hour);
        }
        if(minute<10){
            s += ":0" + Integer.toString(minute);
        }else{
            s += ":" + Integer.toString(minute);
        }
        if(second<10){
            s += ":0" + Integer.toString(second);
        }else {
            s += ":" + Integer.toString(second);
        }
        return s;
    }
    public String toStandart(){
        String s;
        if(hour<10){
            s ="0" + Integer.toString(hour % 12);
        }else {
            s = Integer.toString(hour % 12);
        }
        if(minute<10){
            s += ":0" + Integer.toString(minute);
        }else{
            s += ":" + Integer.toString(minute);
        }
        if(second<10){
            s += ":0" + Integer.toString(second);
        }else {
            s += ":" + Integer.toString(second);
        }
        if(hour>11){
            s += " PM";
        }else{
            s += " AM";
        }
        return s;
    }
    public void add(Time t){
        hour = (hour + t.hour) % 24 + ( (minute + t.minute) * 60  + second + t.second) / 3600;
        minute = (minute + t.minute) % 60 + (second + t.second) / 60;
        second  = (second + t.second) % 60;
    }
}
