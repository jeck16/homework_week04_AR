package carpetcostcalculator17;

public class Floor {
    private double width;
    private double length;

    // Default constructor
    public Floor() {
        width = 0;
        length = 0;
    }

    // Constructor with parameters
    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // Method to get the value of width
    public double getWidth() {
        return width;
    }

    // Method to get the value of length
    public double getLength() {
        return length;
    }

    // Method to calculate the area of the floor
    public double getArea() {
        return width * length;
    }
}
