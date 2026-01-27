package Design_Pattern.ObserverDesignPattern.observables;

import Design_Pattern.ObserverDesignPattern.observers.Observer;

public class User1 implements Obervable{

    Observer observer;

    @Override
    public void update(Observer observer) {
        this.observer = observer;
        notified();
    }

    private void notified() {
        System.out.println(observer.getName() + " is in stock & current stock is : " + observer.getData());
    }


}
