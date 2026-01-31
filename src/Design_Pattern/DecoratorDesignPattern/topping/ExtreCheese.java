package Design_Pattern.DecoratorDesignPattern.topping;

import Design_Pattern.DecoratorDesignPattern.Base.BasePizza;

public class ExtreCheese extends Toppings {
    BasePizza basePizza;
    public ExtreCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        System.out.println("Topping: ExtreCheese added");
        return basePizza.getPrice() + 20;
    }
}
