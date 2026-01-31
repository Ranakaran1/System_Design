package Design_Pattern.DecoratorDesignPattern;

import Design_Pattern.DecoratorDesignPattern.Base.BasePizza;
import Design_Pattern.DecoratorDesignPattern.Base.CrispyCrust;
import Design_Pattern.DecoratorDesignPattern.topping.ExtreCheese;
import Design_Pattern.DecoratorDesignPattern.topping.Toppings;
import Design_Pattern.DecoratorDesignPattern.topping.Veggies;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new CrispyCrust();
        Toppings topping2 = new Veggies(basePizza);
        Toppings toppings = new ExtreCheese(topping2);
        System.out.println(toppings.getPrice());
    }
}
