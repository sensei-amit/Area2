class RectangleArea {
    private double length;
    private double breadth;

    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void displayRectangleDetails() {
        System.out.println("Rectangle Area: " + calculateArea());
        System.out.println("Rectangle Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        CircleArea circle = new CircleArea(5);
        RectanglePerimeter rectangle = new RectanglePerimeter(4, 7);

        circle.displayCircleDetails();
        rectangle.displayRectangleDetails();
    }
}
