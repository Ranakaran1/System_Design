package Design_Pattern.ObserverDesignPattern.observers;

import Design_Pattern.ObserverDesignPattern.observables.Obervable;

import java.util.ArrayList;
import java.util.List;

public class MacBook implements Observer{
    List<Obervable> li ;
    int data;
    String name = "MacBook";
    public MacBook(){
        this.data = 0;
        li = new ArrayList<>();
    }
    public MacBook(ArrayList<Obervable> list){
        li = new ArrayList<>(list);
        this.data =0;
    }
    @Override
    public int getData() {
        return data;
    }

    @Override
    public void setData(int val) {
        if(data==0){
            data+= val;
            notifyObservables();
        }else{
            data+= val;
        }

    }

    @Override
    public void remove(Obervable obervable) {
        li.remove(obervable);
    }

    @Override
    public void add(Obervable obervable) {
        li.add(obervable);
    }

    @Override
    public void notifyObservables() {
        for(Obervable obervable : li){
            obervable.update(this);
        }
    }
    @Override
    public String getName(){
        return this.name;
    }
}
