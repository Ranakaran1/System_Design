package Design_Pattern.DecoratorDesignPattern.Base;

public class DoubleCrust implements BasePizza{

    @Override
    public int getPrice() {
        System.out.println("DoubleCrust added");
        return 150;
    }
}
