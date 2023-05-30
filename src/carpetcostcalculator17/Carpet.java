package carpetcostcalculator17;

public class Carpet {
    private double cost;

    // Default constructor
    public Carpet() {
        cost = 0;
    }

    // Constructor with parameters
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // Method to get the value of cost
    public double getCost() {
        return cost;
    }
}
