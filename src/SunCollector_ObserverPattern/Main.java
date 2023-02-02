package SunCollector_ObserverPattern;

import SunCollector_ObserverPattern.Collector.Collector;
import SunCollector_ObserverPattern.Observer.Dishwasher;
import SunCollector_ObserverPattern.Observer.Heater;
import SunCollector_ObserverPattern.Observer.Observer;

public class Main {
    public static void main(String[] args) {
        Collector c = new Collector();
        Observer h = new Heater(18);
        Observer d = new Dishwasher(17);
        c.addObserver(h);
        c.addObserver(d);
        int hour = 0;
        while (hour != 24){
            hour++;
            if (hour <= 12){
                c.moreSun();
            }else {
                c.lessSun();
            }
        }
    }
}
