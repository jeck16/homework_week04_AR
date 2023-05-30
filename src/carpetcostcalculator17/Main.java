package carpetcostcalculator17;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(2.75, 4.0);
        System.out.println("The area of the floor is " + floor.getArea());
        Carpet carpet = new Carpet(3.5);
        System.out.println("The cost of the carpet is " + carpet.getCost());
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("The total cost to cover the floor with a carpet is " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("The total cost to cover the floor with a carpet is " + calculator.getTotalCost());
    }
}
