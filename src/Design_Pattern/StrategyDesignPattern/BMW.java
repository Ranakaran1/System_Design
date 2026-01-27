package Design_Pattern.StrategyDesignPattern;

import Design_Pattern.StrategyDesignPattern.Strategy.DriveStrategy;

public class BMW extends Vehicle{

    public BMW(DriveStrategy driveStrategy){
        super(driveStrategy);
    }

    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
