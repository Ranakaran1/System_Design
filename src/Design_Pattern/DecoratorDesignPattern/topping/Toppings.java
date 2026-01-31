package Design_Pattern.DecoratorDesignPattern.topping;

import Design_Pattern.DecoratorDesignPattern.Base.BasePizza;

public abstract class Toppings implements BasePizza {


    @Override
    public abstract int getPrice();
}
