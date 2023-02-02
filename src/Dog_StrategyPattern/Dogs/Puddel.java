package Dog_StrategyPattern.Dogs;

import Dog_StrategyPattern.Dogs.ADog;
import Dog_StrategyPattern.bark.barkStrategy;

public class Puddel extends ADog {

    public Puddel(String name) {
        super(name);
    }
    public Puddel(String name, barkStrategy bark) {
        super(name, bark);
    }

    public void run() {
        System.out.println("I'm a Puddel and my name is "+this.name);
        bark();
        bark();
    }
}
