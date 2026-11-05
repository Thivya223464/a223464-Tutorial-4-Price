public class Car implements Price {

    private String brand;
    private double priceCar;
    private boolean buy;

    public Car(String brand, double priceCar) {
        this.brand = brand;
        this.priceCar = priceCar;
    }

    public String getBrand() {
        return brand;
    }

    public String toString() {
        return "The car brand is " + brand + " with price RM" + priceCar + ".";
    }

    public void getPrice(Customer c) {

        System.out.println(toString());

        if (c.getSalary() > 8000) {
            buy = true;
            System.out.println("The customer's name is " + c.getName() + " with salary RM" + c.getSalary() + " can buy this car. Your salary is higher than the price's car.");
        }
        else {
            buy = false;
            System.out.println("The customer's name is " + c.getName() + " with salary RM" + c.getSalary() + " cannot buy this car.");
        }
    }
}