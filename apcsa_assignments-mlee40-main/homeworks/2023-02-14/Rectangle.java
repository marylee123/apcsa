public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }
    public Rectangle(double height, double width){
        super(height, width);
    }
    public double getArea() {
        double area = getHeight() * getWidth();
        System.out.println(area);
        return area;
    }
}