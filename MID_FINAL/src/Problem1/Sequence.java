package Problem1;

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
        StringBuilder palindrome = null;

        for(int i=string.length() ; i>=0 ; i--){
            palindrome.append(string.charAt(i));
        }
        System.out.println(palindrome);
        System.out.println(string);
        for(int i=0 ; i<string.length() ; i++){
            if(palindrome.charAt(i)!=string.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public boolean isSubString(Sequence sequence){
        if(string.contains(sequence.toString())){
            return true;
        }
        return false;
    }

}
