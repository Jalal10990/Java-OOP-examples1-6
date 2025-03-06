// Rectangle class in Java
 class Rectangle {
    // Data members (attributes)
    private double length;
    private double width;

    // Constructor to initialize rectangle dimensions
     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to set dimensions of the rectangle
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display rectangle details
    public void displayInfo() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle myRectangle = new Rectangle(5, 10);

        // Displaying rectangle details
        myRectangle.displayInfo();

        // Modifying rectangle dimensions
        myRectangle.setDimensions(7, 14);
        System.out.println("\nAfter updating dimensions:");
        myRectangle.displayInfo();
    }
}

