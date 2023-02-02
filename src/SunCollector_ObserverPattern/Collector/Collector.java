package SunCollector_ObserverPattern.Collector;

import SunCollector_ObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Collector {
    private int voltage;
    private final int maxVoltage;
    private final List<Observer> observers;

    public Collector() {
        this.voltage = 8;
        this.observers = new ArrayList<>();
        this.maxVoltage = 19;
    }
    public void moreSun() {
        if (this.voltage < this.maxVoltage) {
            this.voltage++;
            System.out.println("New Voltage: " + this.voltage);
            informObservers();
        }
    }
    public void lessSun() {
        if (this.voltage > 0) {
            this.voltage--;
            System.out.println("New Voltage: " + this.voltage);
            informObservers();
        }
    }
    public void informObservers(){
        for (Observer observer : this.observers) {
            observer.inform(this.voltage);
        }
    }
    public void addObserver(Observer o){
        this.observers.add(o);
    }
}
