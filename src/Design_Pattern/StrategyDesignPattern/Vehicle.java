package Design_Pattern.StrategyDesignPattern;

import Design_Pattern.StrategyDesignPattern.Strategy.DriveStrategy;

public abstract class Vehicle {

    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    abstract void drive();


}
