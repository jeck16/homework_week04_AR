package carpetcostcalculator17;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    // Constructor with parameters
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Method to calculate the total cost to cover the floor with a carpet
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
