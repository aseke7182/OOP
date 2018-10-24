package problem4;

public class Sequence {
    private String string;
    public Sequence(){}
    public Sequence(String s){
        string = s;
    }
    public void setString(String newString){
        string = newString;
    }
    public boolean isPalindrome(){
        for(int i=0 ; i< string.length() ; i++){
            if(string.charAt(i) != string.charAt(string.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public boolean isSubString(Sequence sequence){
        String  s = sequence.string;
        int cnt=0;
        for(int i=0 ; i< string.length() ; i++){
            if(s.charAt(0)==string.charAt(i)){
               int index = i;
               while(s.charAt(cnt) != string.charAt(index) && index < i){
                   cnt++;
                   index++;
                   if(cnt==s.length()){
                       return true;
                   }
               }
               cnt = 0;
            }
        }
        return false;
    }
}