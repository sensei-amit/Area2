class RectanglePerimeter {
    private double length;
    private double breadth;


    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }


    public void displayPerimeter() {
        System.out.println("Rectangle Perimeter: " + calculatePerimeter());
    }
}


public class RectangleApplication {
    public static void main(String[] args) {
        RectangleArea area = new RectangleArea(5, 3);
        RectanglePerimeter perimeter = new RectanglePerimeter(5, 3);


        area.displayArea();
        perimeter.displayPerimeter();
    }
}