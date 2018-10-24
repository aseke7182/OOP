package Problem5;

public class MinMax {
    static class ans{
        int minimum;
        int maximum;
        public ans(int one, int two){
            minimum = one;
            maximum = two;
        }

        @Override
        public String toString() {
            return minimum + " " + maximum;
        }
    }

    public static String  minmax(int values[]){
        int min=values[0] , max=values[0];
        for (int i=0 ; i< values.length ; i++){
            if(values[i]>max) max = values[i];
            if(values[i]<min) min = values[i];
        }
        ans a = new ans(min,max);
        return a.toString();
    }
}