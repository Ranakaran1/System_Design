package Design_Pattern.StrategyDesignPattern;

import Design_Pattern.StrategyDesignPattern.Strategy.DriveStrategy;
import Design_Pattern.StrategyDesignPattern.Strategy.SpecialDrive;
import Design_Pattern.StrategyDesignPattern.Strategy.SportsDrive;

public class Main {
    public static void main(String[] args) {
        DriveStrategy specialDrive = new SpecialDrive();
        DriveStrategy sportsDrive = new SportsDrive();
        BMW bmw = new BMW(sportsDrive);
        bmw.drive();

        Mercedes mercedes = new Mercedes(specialDrive);
        mercedes.drive();
    }
}
