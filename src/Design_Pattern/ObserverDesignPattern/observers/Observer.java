package Design_Pattern.ObserverDesignPattern.observers;

import Design_Pattern.ObserverDesignPattern.observables.Obervable;

public interface Observer {
    int getData();
    void setData(int val);
    void remove(Obervable obervable);
    void add(Obervable obervable);
    void notifyObservables();
    String getName();
}
