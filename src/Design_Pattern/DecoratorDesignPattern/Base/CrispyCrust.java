package Design_Pattern.DecoratorDesignPattern.Base;

public class CrispyCrust implements BasePizza{
    @Override
    public int getPrice() {
        System.out.println("CrispyCrust added");
        return 200;
    }
}
