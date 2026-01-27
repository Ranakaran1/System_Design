package Design_Pattern.StrategyDesignPattern.Strategy;

public class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("I am sports drive mechanism");
    }
}
