package Showroom;


class Car{
    // instance members

    private String brand;    //brandd
    private String model;    //models..
    private double price;    //prices
    private double mileage;  //mileage
    private String ownerName; //ownername

    // static members...
    
    private static int totalCars;          
    private static String showroomName = "Supersale Auto Showroom";  

    // constructor 1
    public Car(String b, String m, double p, double mil) {
        this.brand = b; 
        this.model = m; 
        this.price = p; 
        this.mileage = mil; 
        this.ownerName = "Not Assigned"; 
        totalCars++;
    }

    // constructor 2 (overloaded)
    public Car(String b, String m, double p, double mil, String owner) {
        this.brand = b; 
        this.model = m; 
        this.price = p; 
        this.mileage = mil; 
        this.ownerName = owner;   //
        totalCars++;
    }

    // getter & setter for ownerName
    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String owner) {
        this.ownerName = owner;   // ✅ fixed
    }

    // instance method
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Owner: " + this.ownerName);
       
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // static methods
    public static void showTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }

    public static void showShowroomName() {
        System.out.println("Showroom: " + showroomName);
    }
}

public class Showroom {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "X9", 85000,40.0);
        Car c2 = new Car("Nissan", "Altima", 22000, 50.0);
        Car c3 = new Car("Hyundai", "i30", 62000, 30.0);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();

        c1.setOwnerName("Johny");  
        c1.updatePrice(16000);

        System.out.println("After Updates:");
        c1.displayDetails();

        Car.showShowroomName();
        Car.showTotalCars();
    }
}
