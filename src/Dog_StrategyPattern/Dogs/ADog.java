package Dog_StrategyPattern.Dogs;

import Dog_StrategyPattern.bark.barkStrategy;
import Dog_StrategyPattern.bark.wuff;

public abstract class ADog implements Dog {
    protected String name;
    protected barkStrategy bark;

    public ADog(String name) {
        this.name = name;
        this.bark = new wuff();
    }
    public ADog(String name, barkStrategy bark) {
        this.name = name;
        this.bark = bark;
    }

    @Override
    public void bark() {
        this.bark.bark();
    }

    @Override
    public void run() {
        System.out.println(this.name);
        bark();
        bark();
    }

}
