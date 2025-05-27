class CircleArea {
    private double radius;


    public CircleArea(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    public void displayCircleDetails() {
        System.out.println("Circle Area: " + calculateArea());
        System.out.println("Circle Perimeter: " + calculatePerimeter());
    }
}
