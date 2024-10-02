public class Triangle extends Shape {
    public Triangle() {
        super();
    }
    public Triangle(double height, double width){
        super(height, width);
    }
    public double getArea() {
        double area = getHeight() * getWidth() / 2;
        System.out.println(area);
        return area;
    }
}