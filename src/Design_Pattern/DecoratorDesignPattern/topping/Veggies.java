package Design_Pattern.DecoratorDesignPattern.topping;

import Design_Pattern.DecoratorDesignPattern.Base.BasePizza;

public class Veggies extends Toppings{
    BasePizza basePizza;
    public Veggies(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        System.out.println("Topping: Veggies added");
        return basePizza.getPrice() + 30;
    }
}
