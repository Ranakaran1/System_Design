package Design_Pattern.ObserverDesignPattern;

import Design_Pattern.ObserverDesignPattern.observables.User1;
import Design_Pattern.ObserverDesignPattern.observers.MacBook;

public class Main {
    public static void main(String[] args) {
        User1 user1 = new User1();
        MacBook macBook = new MacBook();
        macBook.add(user1);
        macBook.setData(5);

    }
}
