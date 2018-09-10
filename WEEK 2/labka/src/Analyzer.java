public class Analyzer {
    public double Compare(Data d){
        return d.getTotal()/d.getCounter();
    }
    public double max(Data d ){
        return d.getMaximum();
    }
}
