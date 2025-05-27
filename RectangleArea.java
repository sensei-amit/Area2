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


    public void displayArea() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
    
    public static void main(String[] args) {
        CircleArea circle = new CircleArea(5);
        RectanglePerimeter rectangle = new RectanglePerimeter(4, 7);

        circle.displayCircleDetails();
        rectangle.displayRectangleDetails();
    }
}



