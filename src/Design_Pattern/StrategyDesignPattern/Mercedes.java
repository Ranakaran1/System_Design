package Design_Pattern.StrategyDesignPattern;

import Design_Pattern.StrategyDesignPattern.Strategy.DriveStrategy;

public class Mercedes extends Vehicle{

    public Mercedes(DriveStrategy driveStrategy){
        super(driveStrategy);
    }

    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
