public class StarTriangle {
    public int width;
    public StarTriangle(int width){
        this.width = width;
    }
    public String toString(){
        int cnt = 1;
        String ans = "";
        for(int i=0 ; i<width ; i++){
            for(int j=0; j <cnt ; j++){
                ans += "[*]";
            }
            cnt++;
            ans+="\n";
        }
        return ans;
    }
}
