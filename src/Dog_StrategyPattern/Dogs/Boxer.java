package Dog_StrategyPattern.Dogs;

import Dog_StrategyPattern.bark.barkStrategy;

public class Boxer extends ADog {
    public Boxer(String name) {
        super(name);
    }
    public Boxer(String name, barkStrategy bark) {
        super(name, bark);
    }

    @Override
    public void run() {
        System.out.println("I'm a Boxer and my name is "+this.name);
        bark();
        bark();
    }
}
