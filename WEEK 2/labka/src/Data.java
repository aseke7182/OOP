public class Data {
    private double maximum=0;
    private double total=0;
    private int counter=0;
    public Data(){}
    public void Adder(double price){
        counter++;
        if(maximum<price){
            maximum = price;
        }
        total += price;
    }
    public double Average(){
        if(counter==0){
            return 0;
        }
        return total/counter;
    }
    public double Maximum(){
        return maximum;
    }
    public double getMaximum(){
        return maximum;
    }
    public  double getTotal(){
        return total;
    }
    public int getCounter(){
        return counter;
    }

}
