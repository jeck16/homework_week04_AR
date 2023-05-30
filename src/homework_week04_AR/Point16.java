package homework_week04_AR;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields
 */

public class Point16 {
    private int x;
    private int y;

    // Default constructor
    public Point16() {
        x = 0;
        y = 0;
    }

    // Constructor with parameters
    public Point16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the value of x
    public int getX() {
        return x;
    }

    // Method to get the value of y
    public int getY() {
        return y;
    }

    // Method to set the value of x
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the value of y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate the distance between this Point and Point 0,0
    public double distance() {
        return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
    }

    // Method to calculate the distance between this Point and Point x,y
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // Method to calculate the distance between this Point and another Point
    public double distance(Point16 another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
    }

    // Test code
    public static void main(String[] args) {
        Point16 first = new Point16(6, 5);
        Point16 second = new Point16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point16 point = new Point16();
        System.out.println("distance()= " + point.distance());
    }
}
