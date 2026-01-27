package solid.I;
interface ResturantEmployee{
    void washDishes();
    void cookDishes();
    void serveDishes();
    void takeOrder();
}

interface Waiter{
    void serveDishes();
    void takeOrder();
}

interface Cook{
    void washDishes();
    void cookDishes();

}

class WaiterImpl implements Waiter{

    @Override
    public void serveDishes() {
        System.out.println("Serving Dishes");
    }

    @Override
    public void takeOrder() {
       System.out.println("Collecting Orders");
    }
}

class CookImpl implements Cook{

    @Override
    public void washDishes() {
        System.out.println("Washing Dishes");
    }

    @Override
    public void cookDishes() {
       System.out.println("Cooking Dishes");
    }

}
public class ISP {
    public static void main(String[] args) {
        Cook cook = new CookImpl();
        cook.cookDishes();

        Waiter waiter = new WaiterImpl();
        waiter.takeOrder();
    }
    
}
