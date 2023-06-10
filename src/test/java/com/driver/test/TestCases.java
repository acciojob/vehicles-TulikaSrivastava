package com.driver.test;

import com.driver.*;

public class TestCases {
    public static void main(String[] args) {
        // Testing Vehicle class
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        System.out.println("Vehicle Name: " + vehicle.name);
        System.out.println("Current Speed: " + vehicle.currentSpeed);
        System.out.println("Current Direction: " + vehicle.currentDirection);
        vehicle.move(50, 90);
        System.out.println("Updated Speed: " + vehicle.currentSpeed);
        System.out.println("Updated Direction: " + vehicle.currentDirection);
        vehicle.steer(-30);
        System.out.println("Updated Direction after Steering: " + vehicle.currentDirection);
        vehicle.stop();
        System.out.println("Speed after Stopping: " + vehicle.currentSpeed);

        System.out.println();

        // Testing Car class
        Car car = new Car("Toyota", 1);
        System.out.println("Car Name: " + car.name);
        System.out.println("Current Gear: " + car.currentGear);
        car.changeGear(2);
        System.out.println("Updated Gear: " + car.currentGear);
        car.changeSpeed(60, 180);
        System.out.println("Updated Speed: " + car.currentSpeed);
        System.out.println("Updated Direction: " + car.currentDirection);

        System.out.println();

        // Testing F1 class
        F1 f1 = new F1("Mercedes", 1);
        System.out.println("F1 Name: " + f1.name);
        System.out.println("Current Gear: " + f1.currentGear);
        f1.accelerate(150);
        System.out.println("Updated Speed: " + f1.currentSpeed);
        System.out.println("Updated Gear: " + f1.currentGear);

        System.out.println();

        // Testing Boat class
        Boat boat = new Boat("Speedboat", 6);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}
