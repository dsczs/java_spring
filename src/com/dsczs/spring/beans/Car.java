package com.dsczs.spring.beans;

public class Car {
    private String brand;
    private String corp;
    private int price;
    private int maxSpeed;
    
    public Car(String brand, String corp, int price) {
        super();
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        System.out.println("Car [brand=" + brand + ", corp=" + corp + ", price=" + price + "]");
        return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price
                + "]";
    }
    
}
