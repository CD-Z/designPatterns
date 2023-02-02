package Dog_StrategyPattern.Dogs;

import Dog_StrategyPattern.bark.barkStrategy;

public class Schaefer extends ADog {
    public Schaefer(String name) {
        super(name);
    }
    public Schaefer(String name, barkStrategy bark) {
        super(name, bark);
    }

    public void run() {
        System.out.println("I'm a Schäfer and my name is "+this.name);
        bark();
        bark();
    }
}
