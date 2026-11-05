public class Product implements Price {

    private String type;
    private boolean buy;

    public Product(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "The product type is " + type;
    }

    public void getPrice(Customer c) {

        if (c.getSalary() > 4000) {
            buy = true;
            System.out.println("The customer's name is " + c.getName() + " with salary RM" + c.getSalary() + " can buy this product.");
            System.out.println("Your salary is higher than the price's product.");
        }
        else {
            buy = false;
            System.out.println("The customer's name is " + c.getName() + " with salary RM" + c.getSalary() + " cannot buy this product.");
            System.out.println("The product price is more than your salary.");
        }
    }
}