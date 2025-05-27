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
}


