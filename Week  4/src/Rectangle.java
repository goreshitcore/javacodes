public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50.5, 25.7);
        System.out.println("width = " + rectangle.width);
        System.out.println("length = " + rectangle.length);
        System.out.println("area = " + rectangle.area());
    }
}