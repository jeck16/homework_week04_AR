package methodoverriding23;

//Creating a child class
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    public void run(){System.out.println("Bike is running safely");}
    public static void main(String args[]) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
