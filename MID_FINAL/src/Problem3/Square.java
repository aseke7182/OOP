package Problem3;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color , boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.length = side;
        super.width = side;
    }
    public void setWidth(double side){
        super.width = side;
    }
    public void setLength(double side){
        super.length = side;
    }
    public String toString(){
        return "Side: " + super.length + " Area: " + super.getArea() + " Perimeter: " + super.getPerimeter();
    }
    public boolean equals(Object o){
        if(!(o instanceof Square)) return  false;
        Square square = (Square) o;
        return (super.length == square.length );
    }
}