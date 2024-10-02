abstract class Shape {
    private double height;
    private double width;

    public Shape() {
        height = 0;
        width = 0;
    }

    public Shape(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    public abstract double getArea();
}
