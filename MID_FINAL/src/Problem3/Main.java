package Problem3;

public class Main {
    public static void main(String[] args){
        Square square = new Square(20);
        System.out.println(square.toString());
        Rectangle rectangle = new Rectangle(20,15 );
        System.out.println(rectangle.toString());
        Circle circle = new Circle(6);
        System.out.println(circle.toString());
    }
}
