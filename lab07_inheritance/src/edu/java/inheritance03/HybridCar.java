package edu.java.inheritance03;

public class HybridCar extends Car {
    // field 
    private int battery;
    
    public HybridCar(double fuel, double speed, int battery) {
        super(fuel, speed);
        this.battery = battery;
    }
    
    @Override
    public void drive() {
        System.out.println("speed: " + getSpeed() 
                + ", fuel: " + getFuel() 
                + ", battery: " + battery);
    }
    
}
