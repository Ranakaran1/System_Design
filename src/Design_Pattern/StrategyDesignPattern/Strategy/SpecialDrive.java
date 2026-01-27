package Design_Pattern.StrategyDesignPattern.Strategy;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("I am special drive mechanism");
    }
}
